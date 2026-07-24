---
title: "System::Xml::XmlNodeReader::ReadString метод"
linktitle: "ReadString"
second_title: "Aspose.Page для C++"
description: "System::Xml::XmlNodeReader::ReadString метод. Считывает содержимое элемента или текстового узла как строку в C++."
type: docs
weight: 3600
url: /ru/cpp/system.xml/xmlnodereader/readstring/
---
## XmlNodeReader::ReadString method


Читает содержимое элемента или текстового узла как строку.

```cpp
String System::Xml::XmlNodeReader::ReadString() override
```


### ReturnValue

Содержимое элемента или похожего на текст узла (может включать CDATA, [Text](../../../system.text/) узлы и т.д.). Может быть пустой строкой, если читатель находится не на элементе или текстовом узле, или если в текущем контексте больше нет текстового содержимого для возврата. Примечание: Текстовый узел может быть как элементом, так и атрибутом текста.

## См. также

* Class [String](../../../system/string/)
* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
