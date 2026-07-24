---
title: "Метод System::Xml::XmlNodeChangedEventArgs::get_NewValue"
linktitle: "get_NewValue"
second_title: "Aspose.Page для C++"
description: "Метод System::Xml::XmlNodeChangedEventArgs::get_NewValue. Возвращает новое значение узла в C++."
type: docs
weight: 400
url: /ru/cpp/system.xml/xmlnodechangedeventargs/get_newvalue/
---
## XmlNodeChangedEventArgs::get_NewValue method


Возвращает новое значение узла.

```cpp
String System::Xml::XmlNodeChangedEventArgs::get_NewValue()
```


### ReturnValue

Новое значение узла. Этот метод возвращает **nullptr**, если узел не является атрибутом и не является текстовым узлом, либо если узел удаляется. Если вызывается в событии **XmlDocument::NodeChanging**, **get_NewValue** возвращает значение узла, если изменение успешно. Если вызывается в событии **XmlDocument::NodeChanged**, **get_NewValue** возвращает текущее значение узла.

## См. также

* Class [String](../../../system/string/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
