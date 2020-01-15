Action3()
{

	web_add_header("Sec-Fetch-Mode", 
		"navigate");

	web_add_header("Sec-Fetch-Site", 
		"same-origin");

	web_add_header("Sec-Fetch-User", 
		"?1");

	web_add_header("Upgrade-Insecure-Requests", 
		"1");
lr_start_transaction("logout");

	web_url("index.php_8", 
		"URL=https://demo.opencart.com/index.php?route=account/logout", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=https://demo.opencart.com/index.php?route=product/category&path=57&sort=pd.name&order=DESC&limit=75", 
		"Snapshot=t13.inf", 
		"Mode=HTML", 
		LAST);
lr_end_transaction("logout", LR_AUTO);

	return 0;
}