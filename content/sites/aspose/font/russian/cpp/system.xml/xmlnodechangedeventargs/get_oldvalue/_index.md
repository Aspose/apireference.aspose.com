---
title: "System::Xml::XmlNodeChangedEventArgs::get_OldValue метод"
linktitle: "get_OldValue"
second_title: "Aspose.Font для C++"
description: "System::Xml::XmlNodeChangedEventArgs::get_OldValue метод. Возвращает исходное значение узла в C++."
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

Исходное значение узла. Этот метод возвращает **nullptr**, если узел не является атрибутом и не является текстовым узлом, либо если узел вставляется. Если вызван в событии **XmlDocument::NodeChanging**, **get_OldValue** возвращает текущее значение узла, которое будет заменено, если изменение прошло успешно. Если вызван в событии **XmlDocument::NodeChanged**, **get_OldValue** возвращает значение узла до изменения.

## См. также

* Class [String](../../../system/string/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
