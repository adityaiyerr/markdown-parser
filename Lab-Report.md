![Image](Lab2Image1.png)

[Test File 1](https://github.com/adityaiyerr/markdown-parser/blob/main/test-file2.md)
[Test File 2](https://github.com/adityaiyerr/markdown-parser/blob/main/test-file3.md)
[Test File 3](https://github.com/adityaiyerr/markdown-parser/blob/main/test-file4.md)

![Image](Lab2Image4.png)
![Image](Lab2Image3.png)
![Image](Lab2Image2.png)

1. The first error involves an error produced if there is a white space in the URL provided. This results in an infinite loop, which is resolved using the `.substring` and `.replace` functions.
2. The second error involves a situation where there is no ending parenthesis, resulting in an infinite loop. The statement checks if there is an ending `)` and solves the situation if one isn't present
3. Finally, the third error involves a situation where there are no parentheses at all, resulting in an empty `[]` being outputted. The code displayed at the end checks for parentheses and solves the problem by making sure that it only prints something if there are parentheses present.
