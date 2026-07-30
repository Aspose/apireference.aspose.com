---
title: "System::Xml::Schema::XmlSchemaContentProcessing enum"
linktitle: "XmlSchemaContentProcessing"
second_title: "Aspose.Font для C++"
description: "System::Xml::Schema::XmlSchemaContentProcessing enum. Предоставляет информацию о режиме проверки замен элементов any и anyAttribute в C++."
type: docs
weight: 7300
url: /ru/cpp/system.xml.schema/xmlschemacontentprocessing/
---
## XmlSchemaContentProcessing enum


Предоставляет информацию о режиме проверки замен элементов **any** и **anyAttribute**.

```cpp
enum class XmlSchemaContentProcessing
```

### Значения

| Имя | Значение | Описание |
| --- | --- | --- |
| Нет | 0 | Элементы документа не проверяются. |
| Skip | 1 | Элементы документа должны быть корректным XML и не проверяются схемой. |
| Lax | 2 | Если связанная схема найдена, элементы документа будут проверены. В противном случае ошибки не будут выдаваться. |
| Strict | 3 | Процессор схемы должен найти схему, связанную с указанным пространством имён, чтобы проверить элементы документа. |

## См. также

* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
