# Cone interview
<p>Есть 12 квадратов с произвольными числами от 0 до 9 в углах. Квадраты расставлены следующим образом:</p>
<p><img src="/resources/first_pic.gif" width="384" height="340" style="width:384px;height:340px;" alt=""></p>
<p>(числа в углах даны для примера, далее как пример №1)</p>
<p>&nbsp;</p>
<p>Квадраты надо поменять местами таким образом, чтобы сумма чисел четырех соприкасающихся углов была равна 10 (подкрашено зеленым), а двух или трех углов - не более 10 (подкрашено желтым).</p>
<p><img src="/resources/second_pic.gif" width="384" height="340" style="width:384px;height:340px;" alt=""></p>
<p>Язык программирования – Scala <a href="http://www.scala-lang.org/" target="_blank"><font color="#0000ff">http://www.scala-lang.org/</font></a> (предпочтительней) или Java. </p>
<p>&nbsp;</p>
<p>На входе текстовый файл, одна строка – четыре числа – значения углов одного квадрата. Порядок строк и чисел в строке следующий:</p>
<p>&nbsp;</p>
<p><img src="/resources/third_pic.gif" width="384" height="340" style="width:384px;height:340px;" alt=""></p>
<p>&nbsp;</p>
<p>Для примера №1 файл имеет следующий вид:</p>
<p>&nbsp;</p>
<p>1 0 7 5<br>3 4 1 3<br>5 1 1 4<br>7 6 1 8<br>5 7 4 4<br>8 3 3 4<br>7 1 5 4<br>4 1 1 0<br>3 1 1 4<br>2 4 3 8<br>5 1 1 7<br>4 2 4 2</p>
<p>&nbsp;</p>
<p>Окончательный результат перестановки выводится в консоль в том же формате. Если возможно несколько решений, то выводятся все решения, разделенные пустой строкой. </p>
<p>&nbsp;</p>
<p>Оценивается не только правильность решения, но и стиль программирования.</p>
<p>&nbsp;</p>
<p>Дополнительные примеры входного файла: </p>
<p>&nbsp;</p>
<p>8 0 5 1&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 1 6 4 0&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 3 3 3 4<br>4 4 3 6&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 6 1 3 5&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 4 1 3 5<br>3 7 1 2&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 4 0 5 2&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 4 5 3 4<br>5 0 5 2&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 4 1 3 5&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;5 2 1 3<br>3 0 4 3&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 5 1 4 2&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 3 3 7 4<br>5 1 0 7&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 6 5 5 4&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 2 1 3 3<br>4 0 3 3&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;4 0 4 6&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 3 2 6 1<br>5 4 6 0&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 5 2 1 4&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 4 3 3 4<br>3 4 3 0&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 4 6 0 1&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 5 2 2 2<br>1 7 3 8&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 2 0 1 4&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 4 2 2 3<br>0 7 7 3&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 3 0 4 5&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;5 5 1 4<br>3 2 0 4&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;4 0 5 1&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 1 2 5 3</p>
