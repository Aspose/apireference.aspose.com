---
title: "Метод System::TypeInfo::IsDefined"
linktitle: "IsDefined"
second_title: "Aspose.Font для C++"
description: "Метод System::TypeInfo::IsDefined. НЕ РЕАЛИЗОВАН. Указывает, применен ли один или несколько атрибутов указанного типа или его производных к данному члену в C++."
type: docs
weight: 4400
url: /ru/cpp/system/typeinfo/isdefined/
---
## TypeInfo::IsDefined method


НЕ РЕАЛИЗОВАНО. Указывает, применён ли один или несколько атрибутов указанного типа или его производных к этому члену.

```cpp
bool System::TypeInfo::IsDefined(const TypeInfo &attributeType, bool inherit) const
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| attributeType | const TypeInfo\& | Тип пользовательского атрибута для поиска. Поиск включает производные типы. |
| inherit | bool | true — искать атрибуты в цепочке наследования этого члена; иначе false. Этот параметр игнорируется для свойств и событий. |

### ReturnValue

true, если один или несколько экземпляров attributeType или любого из его производных типов применены к этому члену; иначе false.

## См. также

* Class [TypeInfo](../)
* Class [TypeInfo](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
