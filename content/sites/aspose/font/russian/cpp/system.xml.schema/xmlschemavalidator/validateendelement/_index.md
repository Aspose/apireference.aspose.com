---
title: "Метод System::Xml::Schema::XmlSchemaValidator::ValidateEndElement"
linktitle: "ValidateEndElement"
second_title: "Aspose.Font для C++"
description: "Метод System::Xml::Schema::XmlSchemaValidator::ValidateEndElement. Проверяет, является ли текстовое содержимое элемента допустимым в соответствии с его типом данных для элементов с простым содержимым, и проверяет, завершено ли содержимое текущего элемента для элементов со сложным содержимым в C++."
type: docs
weight: 1800
url: /ru/cpp/system.xml.schema/xmlschemavalidator/validateendelement/
---
## XmlSchemaValidator::ValidateEndElement(const SharedPtr\<XmlSchemaInfo\>\&) method


Проверяет, является ли текстовое содержимое элемента допустимым в соответствии с его типом данных для элементов с простым содержимым, и проверяет, полностью ли заполнено содержимое текущего элемента для элементов со сложным содержимым.

```cpp
SharedPtr<Object> System::Xml::Schema::XmlSchemaValidator::ValidateEndElement(const SharedPtr<XmlSchemaInfo> &schemaInfo)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | Объект [XmlSchemaInfo](../../xmlschemainfo/), свойства которого устанавливаются после успешной проверки элемента. Этот параметр может быть **nullptr**. |

### ReturnValue

Разобранное, типизированное текстовое значение элемента, если элемент имеет простое содержимое.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaValidator::ValidateEndElement(const SharedPtr\<XmlSchemaInfo\>\&, const SharedPtr\<Object\>\&) method


Проверяет, является ли указанное текстовое содержимое элемента допустимым в соответствии с его типом данных.

```cpp
SharedPtr<Object> System::Xml::Schema::XmlSchemaValidator::ValidateEndElement(const SharedPtr<XmlSchemaInfo> &schemaInfo, const SharedPtr<Object> &typedValue)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | Объект [XmlSchemaInfo](../../xmlschemainfo/), свойства которого устанавливаются после успешной проверки текстового содержимого элемента. Этот параметр может быть **nullptr**. |
| typedValue | const SharedPtr\<Object\>\& | Типизированное текстовое содержимое элемента. |

### ReturnValue

Разобранное, типизированное простое содержимое элемента.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
