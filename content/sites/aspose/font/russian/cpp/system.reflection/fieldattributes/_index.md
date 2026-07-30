---
title: "Перечисление System::Reflection::FieldAttributes"
linktitle: "FieldAttributes"
second_title: "Aspose.Font для C++"
description: "System::Reflection::FieldAttributes enum. Отражённые атрибуты полей в C++."
type: docs
weight: 1200
url: /ru/cpp/system.reflection/fieldattributes/
---
## FieldAttributes enum


Отражённые атрибуты поля.

```cpp
enum class FieldAttributes
```

### Значения

| Имя | Значение | Описание |
| --- | --- | --- |
| FieldAccessMask | 7 | Маска доступа к члену. Используйте эту маску для получения информации о доступности. |
| PrivateScope | 0 | Члены, недоступные для ссылки. |
| Private | 1 | Приватные члены. |
| FamANDAssem | 2 | Приватные и ограниченные сборкой члены. |
| Assembly | 3 | Члены, ограниченные сборкой. |
| Family | 4 | Члены, доступные типу и его подтипам. |
| FamORAssem | 5 | Члены, доступные типу, подтипам и сборке. |
| Public | 6 | Члены, доступные любому. |
| Static | 16 | Статические члены в отличие от экземплярных членов. |
| InitOnly | 32 | Константные члены, которые можно только инициализировать, но не изменять. |
| Literal | 64 | Члены, константы времени компиляции. |
| NotSerialized | 128 | Несериализованные члены. |
| SpecialName | 512 | Специальное поле одного из указанных ниже имён. |
| PinvokeImpl | 8192 | Реализация, перенаправленная через Interop. |
| ReservedMask | 38144 | Зарезервированные флаги только для использования в среде выполнения. |
| RTSpecialName | 1024 | Среда выполнения должна проверять кодировку имени. |
| HasFieldMarshal | 4096 | Информация о маршаллингe присутствует. |
| HasDefault | 32768 | Значение по умолчанию присутствует. |
| HasFieldRVA | 256 | RVA присутствует. |

## См. также

* Namespace [System::Reflection](../)
* Library [Aspose.Font for C++](../../)
