---
title: "Метод System::Xml::XmlReader::get_Name"
linktitle: "get_Name"
second_title: "Aspose.Font для C++"
description: "Метод System::Xml::XmlReader::get_Name. При переопределении в производном классе получает квалифицированное имя текущего узла в C++."
type: docs
weight: 1500
url: /ru/cpp/system.xml/xmlreader/get_name/
---
## XmlReader::get_Name method


При переопределении в производном классе получает квалифицированное имя текущего узла.

```cpp
virtual String System::Xml::XmlReader::get_Name()
```


### ReturnValue

Квалифицированное имя текущего узла. Например, **Name** равно **bk:book** для элемента **<bk:book>**.
## Примечания



Возвращаемое имя зависит от значения [XmlReader::get_NodeType](../get_nodetype/) узла. Следующие типы узлов возвращают указанные значения. Все остальные типы узлов возвращают пустую строку. |||
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
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
