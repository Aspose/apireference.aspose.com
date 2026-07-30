---
title: "Метод System::Xml::XmlWriter::WriteDocType"
linktitle: "WriteDocType"
second_title: "Aspose.Font для C++"
description: "Метод System::Xml::XmlWriter::WriteDocType. При переопределении в производном классе записывает объявление DOCTYPE с указанным именем и необязательными атрибутами в C++."
type: docs
weight: 1700
url: /ru/cpp/system.xml/xmlwriter/writedoctype/
---
## XmlWriter::WriteDocType method


При переопределении в производном классе, записывает объявление DOCTYPE с указанным именем и необязательными атрибутами.

```cpp
virtual void System::Xml::XmlWriter::WriteDocType(const String &name, const String &pubid, const String &sysid, const String &subset)=0
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| имя | const String\& | Имя DOCTYPE. Оно не должно быть пустым. |
| pubid | const String\& | Если не null, также записывает PUBLIC "pubid" "sysid", где **pubid** и **sysid** заменяются значениями переданных аргументов. |
| sysid | const String\& | Если **pubid** равен **nullptr** и **sysid** не null, он записывает SYSTEM "sysid", где **sysid** заменяется значением этого аргумента. |
| subset | const String\& | Если не null, он записывает [subset], где subset заменяется значением этого аргумента. |

## См. также

* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
