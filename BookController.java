package com.spring.web.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.spring.web.dao.BookDAO;
import com.spring.web.entity.Book;
@Controller
public class BookController 
{
	BookDAO bdao;
	@Autowired
	BookController(BookDAO bdao)
	{
		this.bdao=bdao;
	}
	@GetMapping("/bkPage")
	public String getBkPage(Model model)
	{
		model.addAttribute("bk",new Book(0," ",0.0," "));
		return "DisplayBook";
	}
	@GetMapping("/bkCRUD")
	public String bkCrud(@RequestParam("sub")String sub,@RequestParam("bookid")int bookid,@RequestParam("booktitle")String booktitle,@RequestParam("price")double price,@RequestParam("author")String author,RedirectAttributes ra)
	{
		ra.addFlashAttribute("bk",new Book(bookid,booktitle,price,author));
		String val = "";
		if(sub.equals("Add_Book"))  val = "addBook";
		else if(sub.equals("Del_Book"))  val = "deleteBook";
		else if(sub.equals("Mod_Book"))  val = "modifyBook";
		else val="getBook";
		return "redirect:"+val;
	}
	@GetMapping("/addBook")
	public String addBook(@ModelAttribute("bk")Book b)
	{
		bdao.insertBook(new Book(b.getBookid(),b.getBooktitle(),b.getPrice(),b.getAuthor()));
		return "DisplayBook";
	}
	@GetMapping("/modifyBook")
    public String modifyBook(@ModelAttribute("bk")Book b)
    {
    	bdao.modifyBook(new Book(b.getBookid(),b.getBooktitle(),b.getPrice(),b.getAuthor()));
    	return "DisplayBook";
    }
	@GetMapping("/deleteBook")
    public String deleteBook(@ModelAttribute("bk")Book b)
    {
    	bdao.deleteBook(b.getBookid());
    	return "DisplayBook";
    }
	@GetMapping("/getBook")
    public String getBook(@ModelAttribute("bk")Book b,Model model)
    {
		Book b1 = bdao.getBook(b.getBookid());
    	model.addAttribute("bk",b1);
    	return "DisplayBook";
    }
}
