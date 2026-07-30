---
title: "System::Console::WriteLine 方法"
linktitle: "WriteLine"
second_title: "Aspose.Font 适用于 C++"
description: "System::Console::WriteLine 方法。将当前行终止符输出到标准输出流（在 C++ 中）。"
type: docs
weight: 1100
url: /zh/cpp/system/console/writeline/
---
## Console::WriteLine() method


将当前行终止符输出到标准输出流。

```cpp
static void System::Console::WriteLine()
```

## 另见

* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Console::WriteLine(bool) method


将布尔值的字符串表示形式后跟当前行终止符输出到标准输出流。

```cpp
static void System::Console::WriteLine(bool value)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | bool | 要输出的值 |

## 另见

* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Console::WriteLine(char_t) method


将指定的字符值后跟当前行终止符输出到标准输出流。

```cpp
static void System::Console::WriteLine(char_t value)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | char_t | 要输出的值 |

## 另见

* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Console::WriteLine(const ArrayPtr\<char_t\>\&) method


将指定字符数组的字符串表示形式后跟当前行终止符输出到标准输出流。

```cpp
static void System::Console::WriteLine(const ArrayPtr<char_t> &buffer)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | const ArrayPtr\<char_t\>\& | 要输出的数组 |

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Console::WriteLine(const ArrayPtr\<char_t\>\&, int, int) method


将指定字符数组的指定范围的字符串表示输出到标准输出流，并在其后附加当前的行终止符。

```cpp
static void System::Console::WriteLine(const ArrayPtr<char_t> &buffer, int index, int count)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | const ArrayPtr\<char_t\>\& | 字符数组 |
| 索引 | int | 要输出的范围在数组中的起始索引 |
| count | int | 要输出的范围中的元素数量 |

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Console::WriteLine(const char *) method




```cpp
static void System::Console::WriteLine(const char *)=delete
```

## 另见

* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Console::WriteLine(const char_t *) method


将指定的 c-string 输出到标准输出流，并在其后附加当前的行终止符。

```cpp
static void System::Console::WriteLine(const char_t *value)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | const char_t * | 要输出的 C 字符串 |

## 另见

* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Console::WriteLine(const Decimal\&) method


输出 [Decimal](../../decimal/) 值的字符串表示，随后是当前行终止符，写入标准输出流。

```cpp
static void System::Console::WriteLine(const Decimal &value)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | const Decimal\& | 要输出的值 |

## 另见

* Class [Decimal](../../decimal/)
* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Console::WriteLine(const Exception\&) method


输出指定的 [Exception](../../exception/) 对象的字符串表示，随后是当前行终止符，写入标准输出流。

```cpp
static void System::Console::WriteLine(const Exception &e)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| e | const Exception\& | 要输出的值 |

## 另见

* Typedef [Exception](../../exception/)
* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Console::WriteLine(const SharedPtr\<T\>\&) method


将指定对象的字符串表示形式后跟当前行终止符输出到标准输出流。

```cpp
template<class T> static void System::Console::WriteLine(const SharedPtr<T> &object)
```


| 参数 | 描述 |
| --- | --- |
| T | 要输出的对象的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| object | const SharedPtr\<T\>\& | 要输出的 [Object](../../object/) |

## 另见

* Typedef [SharedPtr](../../sharedptr/)
* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Console::WriteLine(const String\&, Args\&&...) method


将指定参数按照指定格式格式化后的字符串表示输出到标准输出流，并在其后附加当前的行终止符。

```cpp
template<class...> static void System::Console::WriteLine(const String &format, Args &&... args)
```


| 参数 | 描述 |
| --- | --- |
| 该 | 要输出的值的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 格式 | const String\& | 字符串格式 |
| args | Args\\&&... | 要输出的值 |

## 另见

* Class [String](../../string/)
* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Console::WriteLine(const String\&) method


将指定的字符串对象后跟当前行终止符输出到标准输出流。

```cpp
static void System::Console::WriteLine(const String &value)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | const String\& | 要输出的字符串对象 |

## 另见

* Class [String](../../string/)
* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Console::WriteLine(const TypeInfo\&) method


输出 [TypeInfo](../../typeinfo/) 值的字符串表示，随后是当前行终止符，写入标准输出流。

```cpp
static void System::Console::WriteLine(const TypeInfo &value)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | const TypeInfo\& | 要输出的值 |

## 另见

* Class [TypeInfo](../../typeinfo/)
* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Console::WriteLine(double) method


将双精度浮点值的字符串表示形式后跟当前行终止符输出到标准输出流。

```cpp
static void System::Console::WriteLine(double value)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | double | 要输出的值 |

## 另见

* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Console::WriteLine(float) method


将单精度浮点值的字符串表示形式后跟当前行终止符输出到标准输出流。

```cpp
static void System::Console::WriteLine(float value)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | float | 要输出的值 |

## 另见

* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Console::WriteLine(int32_t) method


将 32 位整数值的字符串表示形式后跟当前行终止符输出到标准输出流。

```cpp
static void System::Console::WriteLine(int32_t value)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | int32_t | 要输出的值 |

## 另见

* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Console::WriteLine(int64_t) method


将 64 位整数值的字符串表示形式后跟当前行终止符输出到标准输出流。

```cpp
static void System::Console::WriteLine(int64_t value)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | int64_t | 要输出的值 |

## 另见

* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Console::WriteLine(uint32_t) method


将无符号 32 位整数值的字符串表示输出到标准输出流，并在其后附加当前的行终止符。

```cpp
static void System::Console::WriteLine(uint32_t value)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | uint32_t | 要输出的值 |

## 另见

* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Console::WriteLine(uint64_t) method


将无符号 64 位整数值的字符串表示输出到标准输出流，并在其后附加当前的行终止符。

```cpp
static void System::Console::WriteLine(uint64_t value)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | uint64_t | 要输出的值 |

## 另见

* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
