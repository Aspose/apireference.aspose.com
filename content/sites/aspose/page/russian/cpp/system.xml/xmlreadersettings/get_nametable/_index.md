---
title: "System::Xml::XmlReaderSettings::get_NameTable метод"
linktitle: "get_NameTable"
second_title: "Aspose.Page для C++"
description: "System::Xml::XmlReaderSettings::get_NameTable метод. Возвращает XmlNameTable, используемый для атомизированных сравнений строк в C++."
type: docs
weight: 1500
url: /ru/cpp/system.xml/xmlreadersettings/get_nametable/
---
## XmlReaderSettings::get_NameTable method


Возвращает [XmlNameTable](../../xmlnametable/) используемый для атомизированных сравнений строк.

```cpp
SharedPtr<XmlNameTable> System::Xml::XmlReaderSettings::get_NameTable()
```


### ReturnValue

XmlNameTable, который хранит все атомизированные строки, используемые всеми экземплярами [XmlReader](../../xmlreader/), созданными с использованием этого объекта [XmlReaderSettings](../). По умолчанию **nullptr**. Созданный экземпляр [XmlReader](../../xmlreader/) будет использовать новую пустую [NameTable](../../nametable/), если это значение **nullptr**.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlReaderSettings](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
