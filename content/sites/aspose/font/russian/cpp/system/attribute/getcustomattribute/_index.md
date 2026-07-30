---
title: "Метод System::Attribute::GetCustomAttribute"
linktitle: "GetCustomAttribute"
second_title: "Aspose.Font для C++"
description: "Метод System::Attribute::GetCustomAttribute. Возвращает пользовательский атрибут указанного типа, применённый к указанному типу в C++."
type: docs
weight: 100
url: /ru/cpp/system/attribute/getcustomattribute/
---
## Attribute::GetCustomAttribute method


Возвращает пользовательский атрибут указанного типа, применённый к указанному типу.

```cpp
static Object::ptr System::Attribute::GetCustomAttribute(const TypeInfo &type, const TypeInfo &attributeType)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| тип | const TypeInfo\& | Тип атрибута, который извлекается |
| attributeType | const TypeInfo\& | Тип атрибута для извлечения |

### ReturnValue

Извлечённый атрибут или null, если указанный тип не имеет атрибута указанного типа.

## См. также

* Typedef [ptr](../../object/ptr/)
* Class [TypeInfo](../../typeinfo/)
* Class [Attribute](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
