
//객체를 가지고 올때 
//const username = document.getelementbyid('username');
const username = document.querySelector('#username');
const idCheck = document.querySelector('#id-check');
//const signupValues = document.querySelector('.signup-ip'); // 이렇게하면 한개밖에 못들고옴 클래스로
const signupValues = document.querySelectorAll('.signup-ip'); //배열로 들고옴

idCheck.onclick = () => {
	alert('아이디 : ' + username.value);
	for (let i = 0; i < signupValues.length; i++) {
		alert(signupValues[i].value);
	}

}
//signupValues[0].onblur = () => {
//signupValues[2].value = '신종민';

//}
signupValues[0].onblur = () => {
	const testText = document.querySelector('.test-text');
	//testText.style.display = 'none';
	testText.style.color = 'red';
	// 
	//testText.innerHTML = '<a href="#">테스트</a>';
	const aTag = document.createElement("a");
	const text = document.createTextNode("테스트");
	const href = document.createAttribute("href");
	aTag.setAttributeNode(href);
	aTag.href = "#";
	aTag.append(text);
	testText.append(aTag);
	
	
	
}
