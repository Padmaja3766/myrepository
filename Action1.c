Action1()
{

	web_add_header("Upgrade-Insecure-Requests", 
		"1");

	lr_think_time(38);
lr_start_transaction("register");

	web_url("Register.html", 
		"URL=http://demo.automationtesting.in/Register.html", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://demo.automationtesting.in/", 
		"Snapshot=t19.inf", 
		"Mode=HTML", 
		EXTRARES, 
		"Url=https://adservice.google.co.in/adsid/integrator.js?domain=demo.automationtesting.in", ENDITEM, 
		"Url=https://adservice.google.com/adsid/integrator.js?domain=demo.automationtesting.in", ENDITEM, 
		"Url=https://pagead2.googlesyndication.com/pagead/js/r20200109/r20190131/show_ads_impl_fy2019.js", ENDITEM, 
		"Url=https://www.googletagservices.com/activeview/js/current/osd.js?cb=%2Fr20100101", ENDITEM, 
		LAST);
lr_end_transaction("register", LR_AUTO);

	web_add_auto_header("X-Requested-With", 
		"XMLHttpRequest");

	web_url("Languages.json", 
		"URL=http://demo.automationtesting.in/Languages.json", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=http://demo.automationtesting.in/Register.html", 
		"Snapshot=t20.inf", 
		"Mode=HTML", 
		EXTRARES, 
		"Url=https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/fonts/fontawesome-webfont.woff2?v=4.5.0", "Referer=https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css", ENDITEM, 
		LAST);
lr_start_transaction("skills");

	web_url("Skills.json", 
		"URL=http://demo.automationtesting.in/Skills.json", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=http://demo.automationtesting.in/Register.html", 
		"Snapshot=t21.inf", 
		"Mode=HTML", 
		LAST);
lr_end_transaction("skills", LR_AUTO);

	web_revert_auto_header("X-Requested-With");

	web_add_auto_header("Origin", 
		"http://demo.automationtesting.in");

	web_add_auto_header("Sec-Fetch-Mode", 
		"cors");

	web_add_auto_header("Sec-Fetch-Site", 
		"cross-site");

	web_url("newtable", 
		"URL=https://api.mlab.com/api/1/databases/userdetails/collections/newtable?apiKey=YEX0M2QMPd7JWJw_ipMB3a5gDddt4B_X", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=http://demo.automationtesting.in/Register.html", 
		"Snapshot=t22.inf", 
		"Mode=HTML", 
		LAST);

	web_url("all", 
		"URL=https://restcountries.eu/rest/v1/all", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=http://demo.automationtesting.in/Register.html", 
		"Snapshot=t23.inf", 
		"Mode=HTML", 
		LAST);

	web_url("newtable_2", 
		"URL=https://api.mlab.com/api/1/databases/userdetails/collections/newtable?apiKey=YEX0M2QMPd7JWJw_ipMB3a5gDddt4B_X", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=http://demo.automationtesting.in/Register.html", 
		"Snapshot=t24.inf", 
		"Mode=HTML", 
		LAST);

	return 0;
}