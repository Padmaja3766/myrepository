Action()
{

	web_set_sockets_option("SSL_VERSION", "TLS1.2");

	web_add_header("Upgrade-Insecure-Requests", 
		"1");
lr_start_transaction("login");

	web_url("demo.automationtesting.in", 
		"URL=http://demo.automationtesting.in/", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=", 
		"Snapshot=t13.inf", 
		"Mode=HTML", 
		LAST);
lr_end_transaction("login", LR_AUTO);

	web_add_auto_header("Sec-Fetch-Mode", 
		"no-cors");

	web_add_auto_header("Sec-Fetch-Site", 
		"none");
lr_start_transaction("merchant");

	web_url("bins.json", 
		"URL=https://www.gstatic.com/autofill/hourly/bins.json", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=", 
		"Snapshot=t14.inf", 
		"Mode=HTML", 
		LAST);
lr_end_transaction("merchant", LR_AUTO);

	web_revert_auto_header("Sec-Fetch-Mode");

	web_revert_auto_header("Sec-Fetch-Site");
lr_start_transaction("autofill");

	web_url("merchants.json", 
		"URL=https://www.gstatic.com/autofill/weekly/merchants.json", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=", 
		"Snapshot=t15.inf", 
		"Mode=HTML", 
		LAST);
lr_end_transaction("autofill", LR_AUTO);

	web_add_header("A-IM", 
		"x-bm,gzip");

	web_add_header("Sec-Fetch-Mode", 
		"no-cors");

	web_add_header("Sec-Fetch-Site", 
		"none");

	web_url("seed", 
		"URL=https://clientservices.googleapis.com/chrome-variations/seed?osname=win&channel=stable&milestone=79", 
		"Resource=0", 
		"Referer=", 
		"Snapshot=t16.inf", 
		"Mode=HTML", 
		EXTRARES, 
		"Url=https://clients1.google.com/tbproxy/af/query?q=Chc2LjEuMTcxNS4xNDQyL2VuIChHR0xMKRMZv72dPN_u0M8jLXhvEhkkFA==", "Referer=", ENDITEM, 
		"Url=https://ssl.gstatic.com/safebrowsing/csd/client_model_v5_variation_0.pb", "Referer=", ENDITEM, 
		"Url=https://ssl.gstatic.com/safebrowsing/csd/client_model_v5_ext_variation_0.pb", "Referer=", ENDITEM, 
		LAST);

	web_add_header("Upgrade-Insecure-Requests", 
		"1");

	lr_think_time(9);

	web_url("SignIn.html", 
		"URL=http://demo.automationtesting.in/SignIn.html", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://demo.automationtesting.in/", 
		"Snapshot=t17.inf", 
		"Mode=HTML", 
		EXTRARES, 
		"Url=https://clients1.google.com/tbproxy/af/query?q=Chc2LjEuMTcxNS4xNDQyL2VuIChHR0xMKRMZF54zW6UI8w4jLZFhlU4kIy01hlQcJBQ=", "Referer=", ENDITEM, 
		LAST);

	web_add_header("Origin", 
		"http://demo.automationtesting.in");

	web_add_header("Sec-Fetch-Mode", 
		"cors");

	web_add_header("Sec-Fetch-Site", 
		"cross-site");
lr_start_transaction("user");

	web_url("usertable", 
		"URL=https://api.mlab.com/api/1/databases/userdetails/collections/usertable?apiKey=YEX0M2QMPd7JWJw_ipMB3a5gDddt4B_X", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=http://demo.automationtesting.in/SignIn.html", 
		"Snapshot=t18.inf", 
		"Mode=HTML", 
		LAST);
lr_end_transaction("user", LR_AUTO);

	return 0;
}
