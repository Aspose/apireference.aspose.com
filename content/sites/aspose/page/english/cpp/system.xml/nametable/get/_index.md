---
title: System::Xml::NameTable::Get method
linktitle: Get
second_title: Aspose.Page for C++
description: 'System::Xml::NameTable::Get method. Returns the atomized string with the specified value in C++.'
type: docs
weight: 300
url: /cpp/system.xml/nametable/get/
---
## NameTable::Get(const String\&) method


Returns the atomized string with the specified value.

```cpp
const String & System::Xml::NameTable::Get(const String &value) override
```


| Parameter | Type | Description |
| --- | --- | --- |
| value | const String\& | The name to find. |

### ReturnValue

The atomized string object or **nullptr** if the string has not already been atomized.

## See Also

* Class [String](../../../system/string/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## NameTable::Get(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


Returns the atomized string containing the same characters as the specified range of characters in the given array.

```cpp
const String & System::Xml::NameTable::Get(const ArrayPtr<char16_t> &key, int32_t start, int32_t len) override
```


| Parameter | Type | Description |
| --- | --- | --- |
| key | const ArrayPtr\<char16_t\>\& | The character array containing the name to find. |
| start | int32_t | The zero-based index into the array specifying the first character of the name. |
| len | int32_t | The number of characters in the name. |

### ReturnValue

The atomized string or **nullptr** if the string has not already been atomized. If **len** is zero, [String::Empty](../../../system/string/empty/) is returned.

## See Also

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
