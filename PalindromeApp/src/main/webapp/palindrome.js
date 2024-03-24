function palindromOrNot()
{
	//read the number input store in variable
	const n=document.getElementById("numberInput").value;
	
	//convert the number input to palindrom
	let p="";
	for(let i=n.length-1;i>=0;i--)
	p=p+n[i];
	//set the output to result output field
	if(p==n)
	{
		alert("its a palindrom");
		
	}
	else
	{
       alert("its not a palindrom");

	}
}