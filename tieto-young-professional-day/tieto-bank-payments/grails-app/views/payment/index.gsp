<html>
<body>
<g:each in="${payments}" var="payment">
   <p>Date: ${payment.date}<br>
  Payment amount ${payment.amount},-<br>
   From: ${payment.from.owner.name}<br>
   To: ${payment.to.owner.name}</p>
   <li>
   	<g:link action = "remove" id = "${payment.id}"> Remove</g:link>
   </li>
</g:each>
</body>
</html>
