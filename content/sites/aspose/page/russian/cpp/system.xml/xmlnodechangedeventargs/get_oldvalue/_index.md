---
title: "Метод System::Xml::XmlNodeChangedEventArgs::get_OldValue"
linktitle: "get_OldValue"
second_title: "Aspose.Page для C++"
description: "Метод System::Xml::XmlNodeChangedEventArgs::get_OldValue. Возвращает оригинальное значение узла в C++."
type: docs
weight: 700
url: /ru/cpp/system.xml/xmlnodechangedeventargs/get_oldvalue/
---
## XmlNodeChangedEventArgs::get_OldValue method


Возвращает исходное значение узла.

```cpp
String System::Xml::XmlNodeChangedEventArgs::get_OldValue()
```


### ReturnValue

Исходное значение узла. Этот метод возвращает **nullptr**, если узел не является атрибутом и не является текстовым узлом, либо если узел вставляется. Если вызывается в событии **XmlDocument::NodeChanging**, **get_OldValue** возвращает текущее значение узла, которое будет заменено, если изменение успешно. Если вызывается в событии **XmlDocument::NodeChanged**, **get_OldValue** возвращает значение узла до изменения.

## См. также

* Class [String](../../../system/string/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
