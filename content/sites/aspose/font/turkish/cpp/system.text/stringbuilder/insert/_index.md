---
title: "System::Text::StringBuilder::Insert yöntemi"
linktitle: "Ekle"
second_title: "Aspose.Font için C++"
description: "System::Text::StringBuilder::Insert yöntemi. C++'ta builder'ın sabit konumuna karakter ekler."
type: docs
weight: 1200
url: /tr/cpp/system.text/stringbuilder/insert/
---
## StringBuilder::Insert(int, const System::ArrayPtr\<char_t\>\&, int, int) method


Builder'ın sabit konumuna karakterler ekler.

```cpp
StringBuilder * System::Text::StringBuilder::Insert(int index, const System::ArrayPtr<char_t> &chars, int startIndex, int charCount)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| indeks | int | Karakterlerin ekleneceği konum. |
| chars | const System::ArrayPtr\<char_t\>\& | [Array](../../../system/array/) dilim eklemek için kaynak. |
| startIndex | int | [Array](../../../system/array/) dilim başlangıç indeksi. |
| charCount | int | [Array](../../../system/array/) dilim uzunluğu. |

### ReturnValue

Bu gösterici.

## Ayrıca Bakınız

* Class [StringBuilder](../)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Insert(int, char_t) method


Builder'ın sabit konumuna karakter ekler.

```cpp
StringBuilder * System::Text::StringBuilder::Insert(int startIndex, char_t ch)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| startIndex | int | Karakterlerin ekleneceği konum. |
| ch | char_t | Eklenecek karakter. |

### ReturnValue

Bu gösterici.

## Ayrıca Bakınız

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Insert(int, const String\&) method


Builder'ın sabit konumuna dize ekler.

```cpp
StringBuilder * System::Text::StringBuilder::Insert(int startIndex, const String &str)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| startIndex | int | Karakterlerin ekleneceği konum. |
| str | const String\& | [String](../../../system/string/) eklenecek. |

### ReturnValue

Bu gösterici.

## Ayrıca Bakınız

* Class [StringBuilder](../)
* Class [String](../../../system/string/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Insert(int, T) method


Builder'ın sabit konumuna değeri ekler.

```cpp
template<typename T> std::enable_if<std::is_arithmetic<T>::value, StringBuilder *>::type System::Text::StringBuilder::Insert(int startIndex, T value)
```


| Parametre | Açıklama |
| --- | --- |
| Parametre | tip. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| startIndex | int | Karakterlerin ekleneceği konum. |
| değer | T | Biçimlendirilip eklenecek değer. |

### ReturnValue

Bu gösterici.

## Ayrıca Bakınız

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Insert(int32_t, const String\&, int32_t) method


Builder'ın sabit konumuna yinelenen dize ekler.

```cpp
StringBuilder * System::Text::StringBuilder::Insert(int32_t index, const String &value, int32_t count)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| indeks | int32_t | Karakterlerin ekleneceği konum. |
| value | const String\& | [String](../../../system/string/) eklenecek. |
| count | int32_t | **value** dizesinin kaç kez tekrarlanacağı. |

### ReturnValue

Bu gösterici.

## Ayrıca Bakınız

* Class [StringBuilder](../)
* Class [String](../../../system/string/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
