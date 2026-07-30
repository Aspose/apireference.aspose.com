---
title: "System::String::ToByteArray метод"
linktitle: "ToByteArray"
second_title: "Aspose.Font для C++"
description: "System::String::ToByteArray метод. Преобразует строку или подстроку в массив байтов в C++."
type: docs
weight: 4700
url: /ru/cpp/system/string/tobytearray/
---
## String::ToByteArray method


Преобразует строку или подстроку в массив байтов.

```cpp
ArrayPtr<uint8_t> System::String::ToByteArray(int32_t startIndex=0, int32_t length=INT32_MAX, bool LE=true) const
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| startIndex | int32_t | Индекс начала подстроки. |
| длина | int32_t | Длина подстроки. |
| LE | bool | Если true, кодировать символы, используя little endianness; иначе использовать big endianness. |

### ReturnValue

[Array](../../array/) containing bytes representing characters of the string.

## См. также

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
