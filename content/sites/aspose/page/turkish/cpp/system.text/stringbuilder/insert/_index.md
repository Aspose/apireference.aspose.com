---
title: "System::Text::StringBuilder::Insert metodu"
linktitle: "Ekle"
second_title: "Aspose.Page için C++"
description: "System::Text::StringBuilder::Insert metodu. C++'ta StringBuilder'ın sabit konumuna karakter ekler."
type: docs
weight: 1200
url: /tr/cpp/system.text/stringbuilder/insert/
---
## StringBuilder::Insert(int, const System::ArrayPtr\<char_t\>\&, int, int) method


Karakterleri oluşturucunun sabit konumuna ekler.

```cpp
StringBuilder * System::Text::StringBuilder::Insert(int index, const System::ArrayPtr<char_t> &chars, int startIndex, int charCount)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| indeks | int | Karakterlerin ekleneceği konum. |
| chars | const System::ArrayPtr\<char_t\>\& | [Array](../../../system/array/) eklenecek dilimin kaynağı. |
| startIndex | int | [Array](../../../system/array/) dilim başlangıç indeksi. |
| charCount | int | [Array](../../../system/array/) dilim uzunluğu. |

### ReturnValue

Bu işaretçi.

## Ayrıca Bakınız

* Class [StringBuilder](../)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Insert(int, char_t) method


Karakteri oluşturucunun sabit konumuna ekler.

```cpp
StringBuilder * System::Text::StringBuilder::Insert(int startIndex, char_t ch)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| startIndex | int | Karakterlerin ekleneceği konum. |
| ch | char_t | Eklenecek karakter. |

### ReturnValue

Bu işaretçi.

## Ayrıca Bakınız

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Insert(int, const String\&) method


Dizeyi oluşturucunun sabit konumuna ekler.

```cpp
StringBuilder * System::Text::StringBuilder::Insert(int startIndex, const String &str)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| startIndex | int | Karakterlerin ekleneceği konum. |
| str | const String\& | [String](../../../system/string/) eklemek için. |

### ReturnValue

Bu işaretçi.

## Ayrıca Bakınız

* Class [StringBuilder](../)
* Class [String](../../../system/string/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Insert(int, T) method


Değeri oluşturucunun sabit konumuna ekler.

```cpp
template<typename T> std::enable_if<std::is_arithmetic<T>::value, StringBuilder *>::type System::Text::StringBuilder::Insert(int startIndex, T value)
```


| Parameter | Açıklama |
| --- | --- |
| Parameter | tip. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| startIndex | int | Karakterlerin ekleneceği konum. |
| değer | T | Biçimlendirilip eklenecek değer. |

### ReturnValue

Bu işaretçi.

## Ayrıca Bakınız

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Insert(int32_t, const String\&, int32_t) method


Tekrarlanan dizeyi oluşturucunun sabit konumuna ekler.

```cpp
StringBuilder * System::Text::StringBuilder::Insert(int32_t index, const String &value, int32_t count)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| indeks | int32_t | Karakterlerin ekleneceği konum. |
| value | const String\& | [String](../../../system/string/) eklemek için. |
| count | int32_t | **value** dizesini kaç kez tekrarlamak. |

### ReturnValue

Bu işaretçi.

## Ayrıca Bakınız

* Class [StringBuilder](../)
* Class [String](../../../system/string/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
