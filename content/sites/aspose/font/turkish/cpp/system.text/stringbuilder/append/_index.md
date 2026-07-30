---
title: "System::Text::StringBuilder::Append yöntemi"
linktitle: "Ekle"
second_title: "Aspose.Font için C++"
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


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| c | char_t | Karakter değeri. |

### ReturnValue

Bu gösterici.

## Ayrıca Bakınız

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Append(char_t, int) method


Yapıcıya karakterler ekler.

```cpp
StringBuilder * System::Text::StringBuilder::Append(char_t c, int count)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| c | char_t | Karakter değeri. |
| count | int | Eklenecek karakterin kaç kez tekrarlanacağı. |

### ReturnValue

Bu gösterici.

## Ayrıca Bakınız

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Append(const ArrayPtr\<char_t\>\&) method


Yapıcıya karakter dizisi ekler.

```cpp
StringBuilder * System::Text::StringBuilder::Append(const ArrayPtr<char_t> &arr)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| arr | const ArrayPtr\<char_t\>\& | Eklenecek karakterler. |

### ReturnValue

Bu gösterici.

## Ayrıca Bakınız

* Class [StringBuilder](../)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Append(const ArrayPtr\<char_t\>\&, int, int) method


Yapıcıya karakter dizisi dilimini ekler.

```cpp
StringBuilder * System::Text::StringBuilder::Append(const ArrayPtr<char_t> &arr, int startIndex, int charCount)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| arr | const ArrayPtr\<char_t\>\& | Eklenecek karakterler. |
| startIndex | int | Dilim başlangıç indeksi. |
| charCount | int | Dilim uzunluğu. |

### ReturnValue

Bu gösterici.

## Ayrıca Bakınız

* Class [StringBuilder](../)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Append(const SharedPtr\<StringBuilder\>\&) method


Yapıcıya başka bir yapıcının içeriğini ekler.

```cpp
StringBuilder * System::Text::StringBuilder::Append(const SharedPtr<StringBuilder> &builder)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| oluşturucu | const SharedPtr\<StringBuilder\>\& | İçerik eklemek için oluşturucu. |

### ReturnValue

Bu gösterici.

## Ayrıca Bakınız

* Class [StringBuilder](../)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Append(const SharedPtr\<T\>\&) method


Yapıcıya nesnenin dize temsilini ekler.

```cpp
template<class T> StringBuilder * System::Text::StringBuilder::Append(const SharedPtr<T> &obj)
```


| Parametre | Açıklama |
| --- | --- |
| T | [Object](../../../system/object/) türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | const SharedPtr\<T\>\& | [Object](../../../system/object/) serileştirilecek ve eklenecek. |

### ReturnValue

Bu gösterici.

## Ayrıca Bakınız

* Class [StringBuilder](../)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Append(const String\&) method


Yapıcıya dize ekler.

```cpp
StringBuilder * System::Text::StringBuilder::Append(const String &str)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| str | const String\& | [String](../../../system/string/) eklemek için. |

### ReturnValue

Bu gösterici.

## Ayrıca Bakınız

* Class [StringBuilder](../)
* Class [String](../../../system/string/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Append(const String\&, int, int) method


Yapıcıya dize dilimini ekler.

```cpp
StringBuilder * System::Text::StringBuilder::Append(const String &str, int startIndex, int charCount)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| str | const String\& | [String](../../../system/string/) eklemek için. |
| startIndex | int | Dilim başlangıç indeksi. |
| charCount | int | Dilim uzunluğu. |

### ReturnValue

Bu gösterici.

## Ayrıca Bakınız

* Class [StringBuilder](../)
* Class [String](../../../system/string/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Append(double) method


Yapıcıya kayan nokta değerini ekler.

```cpp
StringBuilder * System::Text::StringBuilder::Append(double df)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| df | double | Serileştirilecek ve eklenecek değer. |

### ReturnValue

Bu gösterici.

## Ayrıca Bakınız

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Append(E) method


Builder'a enum değeri dize temsili ekler.

```cpp
template<class E> std::enable_if<std::is_enum<E>::value, StringBuilder *>::type System::Text::StringBuilder::Append(E e)
```


| Parametre | Açıklama |
| --- | --- |
| E | [Enum](../../../system/enum/) türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| e | E | Serileştirilecek ve eklenecek değer. |

### ReturnValue

Bu gösterici.

## Ayrıca Bakınız

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Append(float) method


Yapıcıya kayan nokta değerini ekler.

```cpp
StringBuilder * System::Text::StringBuilder::Append(float f)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| f | float | Serileştirilecek ve eklenecek değer. |

### ReturnValue

Bu gösterici.

## Ayrıca Bakınız

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Append(int) method


Builder'a tam sayı değeri ekler.

```cpp
StringBuilder * System::Text::StringBuilder::Append(int i)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| i | int | Serileştirilecek ve eklenecek değer. |

### ReturnValue

Bu gösterici.

## Ayrıca Bakınız

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Append(T) method


Builder'a aritmetik değer ekler.

```cpp
template<typename T> std::enable_if<std::is_arithmetic<T>::value, StringBuilder *>::type System::Text::StringBuilder::Append(T value)
```


| Parametre | Açıklama |
| --- | --- |
| T | Aritmetik tür. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | T | Serileştirilecek ve eklenecek değer. |

### ReturnValue

Bu gösterici.

## Ayrıca Bakınız

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
