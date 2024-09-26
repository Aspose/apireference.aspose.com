---
title: System::Default method
linktitle: Default
second_title: Aspose.Font for C++
description: 'System::Default method. Returns the default-constructed instance of the specified type in C++.'
type: docs
weight: 24000
url: /cpp/system/default/
---
## System::Default() method


Returns the default-constructed instance of the specified type.

```cpp
template<typename T> std::enable_if<IsExceptionWrapper<T>::value, constT &>::type System::Default()
```


| Parameter | Description |
| --- | --- |
| T | The type whose instance is returned |

## See Also

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::Default() method


Returns the default-constructed instance of the specified type.

```cpp
template<typename T> std::enable_if<!IsExceptionWrapper<T>::value, constT &>::type System::Default()
```


| Parameter | Description |
| --- | --- |
| T | The type whose instance is returned |

## See Also

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
