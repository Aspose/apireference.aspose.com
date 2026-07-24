---
title: "System::Text::StringBuilder::Append yöntemi"
linktitle: "Ekle"
second_title: "Aspose.Page için C++"
description: "System::Text::StringBuilder::Append yöntemi. C++'ta oluşturucuya karakter ekler."
type: docs
weight: 300
url: /tr/cpp/system.text/stringbuilder/append/
---
## StringBuilder::Append(char_t) method


Yapıcıya karakter ekler.

```cpp
StringBuilder * System::Text::StringBuilder::Append(char_t c)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| c | char_t | Karakter değeri. |

### ReturnValue

Bu işaretçi.

## Ayrıca Bakınız

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(char_t, int) method


Yapıcıya karakterler ekler.

```cpp
StringBuilder * System::Text::StringBuilder::Append(char_t c, int count)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| c | char_t | Karakter değeri. |
| count | int | Eklenmek istenen karakteri kaç kez tekrarlamak. |

### ReturnValue

Bu işaretçi.

## Ayrıca Bakınız

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(const ArrayPtr\<char_t\>\&) method


Yapıcıya karakter dizisi ekler.

```cpp
StringBuilder * System::Text::StringBuilder::Append(const ArrayPtr<char_t> &arr)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| arr | const ArrayPtr\<char_t\>\& | Eklenecek karakterler. |

### ReturnValue

Bu işaretçi.

## Ayrıca Bakınız

* Class [StringBuilder](../)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(const ArrayPtr\<char_t\>\&, int, int) method


Yapıcıya karakter dizisi dilimini ekler.

```cpp
StringBuilder * System::Text::StringBuilder::Append(const ArrayPtr<char_t> &arr, int startIndex, int charCount)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| arr | const ArrayPtr\<char_t\>\& | Eklenecek karakterler. |
| startIndex | int | Dilim başlangıç indeksi. |
| charCount | int | Dilim uzunluğu. |

### ReturnValue

Bu işaretçi.

## Ayrıca Bakınız

* Class [StringBuilder](../)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(const SharedPtr\<StringBuilder\>\&) method


Yapıcının içeriğini yapıcıya ekler.

```cpp
StringBuilder * System::Text::StringBuilder::Append(const SharedPtr<StringBuilder> &builder)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| oluşturucu | const SharedPtr\<StringBuilder\>\& | İçerik eklemek için oluşturucu. |

### ReturnValue

Bu işaretçi.

## Ayrıca Bakınız

* Class [StringBuilder](../)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(const SharedPtr\<T\>\&) method


Yapıcıya nesnenin dize temsilini ekler.

```cpp
template<class T> StringBuilder * System::Text::StringBuilder::Append(const SharedPtr<T> &obj)
```


| Parameter | Açıklama |
| --- | --- |
| T | [Object](../../../system/object/) türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| obj | const SharedPtr\<T\>\& | [Object](../../../system/object/) serileştirip eklemek için. |

### ReturnValue

Bu işaretçi.

## Ayrıca Bakınız

* Class [StringBuilder](../)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(const String\&) method


Yapıcıya dize ekler.

```cpp
StringBuilder * System::Text::StringBuilder::Append(const String &str)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| str | const String\& | [String](../../../system/string/) eklenecek. |

### ReturnValue

Bu işaretçi.

## Ayrıca Bakınız

* Class [StringBuilder](../)
* Class [String](../../../system/string/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(const String\&, int, int) method


Yapıcıya dize dilimini ekler.

```cpp
StringBuilder * System::Text::StringBuilder::Append(const String &str, int startIndex, int charCount)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| str | const String\& | [String](../../../system/string/) eklenecek. |
| startIndex | int | Dilim başlangıç indeksi. |
| charCount | int | Dilim uzunluğu. |

### ReturnValue

Bu işaretçi.

## Ayrıca Bakınız

* Class [StringBuilder](../)
* Class [String](../../../system/string/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(double) method


Yapıcıya kayan nokta değerini ekler.

```cpp
StringBuilder * System::Text::StringBuilder::Append(double df)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| df | double | Serileştirip eklemek için değer. |

### ReturnValue

Bu işaretçi.

## Ayrıca Bakınız

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(E) method


Enum değerinin dize temsilini oluşturucuya ekler.

```cpp
template<class E> std::enable_if<std::is_enum<E>::value, StringBuilder *>::type System::Text::StringBuilder::Append(E e)
```


| Parameter | Açıklama |
| --- | --- |
| E | [Enum](../../../system/enum/) türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| e | E | Serileştirip eklemek için değer. |

### ReturnValue

Bu işaretçi.

## Ayrıca Bakınız

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(float) method


Yapıcıya kayan nokta değerini ekler.

```cpp
StringBuilder * System::Text::StringBuilder::Append(float f)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| f | float | Serileştirip eklemek için değer. |

### ReturnValue

Bu işaretçi.

## Ayrıca Bakınız

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(int) method


Yapıcıya tam sayı değerini ekler.

```cpp
StringBuilder * System::Text::StringBuilder::Append(int i)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| i | int | Serileştirip eklemek için değer. |

### ReturnValue

Bu işaretçi.

## Ayrıca Bakınız

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(T) method


Yapıcıya aritmetik değeri ekler.

```cpp
template<typename T> std::enable_if<std::is_arithmetic<T>::value, StringBuilder *>::type System::Text::StringBuilder::Append(T value)
```


| Parameter | Açıklama |
| --- | --- |
| T | Aritmetik tür. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| değer | T | Serileştirip eklemek için değer. |

### ReturnValue

Bu işaretçi.

## Ayrıca Bakınız

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
