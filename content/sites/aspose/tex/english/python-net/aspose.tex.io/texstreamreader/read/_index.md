---
title: read method
second_title: Aspose.TeX for Python via .NET API References
description: 
type: docs
weight: 30
url: /python-net/aspose.tex.io/texstreamreader/read/
is_root: false
---

## read {#}

Reads the next character from the text reader and advances the character position by one character.


### Returns 


The next character from the text reader, or -1 if no more characters are available.


```python
def read(self):
    ...
```




## read {#list-int-int}

Reads a specified maximum number of characters from the current reader and writes the data to a buffer,
beginning at the specified index.


### Returns 


The number of characters that have been read. The number will be less than or equal to count,
depending on whether the data is available within the reader. This method returns 0 (zero) if it is called
when no more characters are left to read.


```python
def read(self, buffer, index, count):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| buffer | list | When this method returns, contains the specified character array with the values<br/>between index and (index + count - 1) replaced by the characters read from the current source. |
| index | int | The position in buffer at which to begin writing. |
| count | int | he maximum number of characters to read. If the end of the reader is reached before<br/>the specified number of characters is read into the buffer, the method returns. |



### See Also
* module [`aspose.tex.io`](../../)
* class [`TeXStreamReader`](/tex/python-net/aspose.tex.io/texstreamreader)
