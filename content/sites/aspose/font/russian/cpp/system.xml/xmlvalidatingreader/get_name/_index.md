---
title: "System::Xml::XmlValidatingReader::get_Name метод"
linktitle: "get_Name"
second_title: "Aspose.Font для C++"
description: "System::Xml::XmlValidatingReader::get_Name метод. Возвращает квалифицированное имя текущего узла в C++."
type: docs
weight: 1700
url: /ru/cpp/system.xml/xmlvalidatingreader/get_name/
---
## XmlValidatingReader::get_Name method


Возвращает квалифицированное имя текущего узла.

```cpp
String System::Xml::XmlValidatingReader::get_Name() override
```


### ReturnValue

Квалифицированное имя текущего узла. Например, **Name** равно **bk:book** для элемента **<bk:book>**.
## Примечания



Возвращаемое имя зависит от XmlValidatingReader::NodeType узла. Следующие типы узлов возвращают указанные значения. Все остальные типы узлов возвращают пустую строку. |||
|-|-|
| Тип узла | Имя |
| Attribute | Имя атрибута. |
| DocumentType | Имя типа документа. |
| Element | Имя тега. |
| EntityReference | Имя ссылки на сущность. |
| ProcessingInstruction | Цель инструкции обработки. |
| XmlDeclaration | Буквальная строка xml. |

## См. также

* Class [String](../../../system/string/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
