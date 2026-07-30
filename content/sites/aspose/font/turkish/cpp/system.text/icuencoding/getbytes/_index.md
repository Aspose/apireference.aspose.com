---
title: "System::Text::ICUEncoding::GetBytes yöntemi"
linktitle: "GetBytes"
second_title: "Aspose.Font için C++"
description: "System::Text::ICUEncoding::GetBytes yöntemi. Bir karakter tamponunu kodlayarak elde edilen baytları alır C++'ta."
type: docs
weight: 300
url: /tr/cpp/system.text/icuencoding/getbytes/
---
## ICUEncoding::GetBytes(ArrayPtr\<char_t\>) method


Bir karakter tamponunu kodlamanın sonucunda oluşan baytları alın.

```cpp
virtual ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(ArrayPtr<char_t> chars)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | Kodlanacak karakterler. |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUEncoding::GetBytes(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int) method


Bir karakter tamponunu kodlamanın sonucunda oluşan baytları alın.

```cpp
virtual int System::Text::Encoding::GetBytes(ArrayPtr<char_t> chars, int char_index, int char_count, ArrayPtr<uint8_t> bytes, int byte_index)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | Kodlanacak karakterler. |
| char_index | int | Karakter diliminin başlangıcı. |
| char_count | int | Dönüştürülecek karakter sayısı. |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) karakterleri koymak için. |
| byte_index | int | Çıktı tamponu ofseti. |

### ReturnValue

Yazılan bayt sayısı.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUEncoding::GetBytes(ArrayPtr\<char_t\>, int, int) method


Bir karakter tamponunu kodlamanın sonucunda oluşan baytları alın.

```cpp
virtual ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(ArrayPtr<char_t> chars, int index, int count)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | Kodlanacak karakterler. |
| indeks | int | Karakter diliminin başlangıcı. |
| count | int | Dönüştürülecek karakter sayısı. |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUEncoding::GetBytes(const char_t *, int, uint8_t *, int) method


Bir karakter tamponunu kodlamanın sonucunda oluşan baytları alın.

```cpp
int System::Text::ICUEncoding::GetBytes(const char_t *chars, int char_count, uint8_t *bytes, int byte_count) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| chars | const char_t * | Kodlanacak karakterler. |
| char_count | int | Dönüştürülecek karakter sayısı. |
| bytes | uint8_t * | [Buffer](../../../system/buffer/) karakterleri koymak için. |
| byte_count | int | Çıktı tamponu boyutu. |

### ReturnValue

Yazılan bayt sayısı.

## Ayrıca Bakınız

* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUEncoding::GetBytes(const String\&) method


Bir karakter tamponunu kodlamanın sonucunda oluşan baytları alın.

```cpp
virtual ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(const String &s)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| s | const String\& | [String](../../../system/string/) kodlamak için. |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUEncoding::GetBytes(const String\&, int, int, ArrayPtr\<uint8_t\>, int) method


Bir karakter tamponunu kodlamanın sonucunda oluşan baytları alın.

```cpp
virtual int System::Text::Encoding::GetBytes(const String &s, int char_index, int char_count, ArrayPtr<uint8_t> bytes, int byte_index)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| s | const String\& | [String](../../../system/string/) kodlamak için. |
| char_index | int | Karakter diliminin başlangıcı. |
| char_count | int | Dönüştürülecek karakter sayısı. |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) karakterleri koymak için. |
| byte_index | int | Çıktı tamponu ofseti. |

### ReturnValue

Yazılan bayt sayısı.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUEncoding::GetBytes(const System::Details::ArrayView\<char_t\>\&, int, int) method


Bir karakter tamponunu kodlamanın sonucunda oluşan baytları alın.

```cpp
virtual ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(const System::Details::ArrayView<char_t> &chars, int index, int count)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| chars | const System::Details::ArrayView\<char_t\>\& | Kodlanacak karakterler. |
| indeks | int | Karakter diliminin başlangıcı. |
| count | int | Dönüştürülecek karakter sayısı. |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUEncoding::GetBytes(const System::Details::StackArray\<char_t, N\>\&, int, int) method


Bir karakter tamponunu kodlamanın sonucunda oluşan baytları alın.

```cpp
template<std::size_t> ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(const System::Details::StackArray<char_t, N> &chars, int index, int count)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| chars | const System::Details::StackArray\<char_t, N\>\& | Kodlanacak karakterler. |
| indeks | int | Karakter diliminin başlangıcı. |
| count | int | Dönüştürülecek karakter sayısı. |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUEncoding::GetBytes(System::Details::ArrayView\<char_t\>, int, int, System::Details::ArrayView\<uint8_t\>, int) method


Bir karakter tamponunu kodlamanın sonucunda oluşan baytları alın.

```cpp
virtual int System::Text::Encoding::GetBytes(System::Details::ArrayView<char_t> chars, int char_index, int char_count, System::Details::ArrayView<uint8_t> bytes, int byte_index)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| chars | System::Details::ArrayView\<char_t\> | Kodlanacak karakterler. |
| char_index | int | Karakter diliminin başlangıcı. |
| char_count | int | Dönüştürülecek karakter sayısı. |
| bytes | System::Details::ArrayView\<uint8_t\> | [Buffer](../../../system/buffer/) karakterleri koymak için. |
| byte_index | int | Çıktı tamponu ofseti. |

### ReturnValue

Yazılan bayt sayısı.

## Ayrıca Bakınız

* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUEncoding::GetBytes(System::Details::StackArray\<char_t, SC\>\&, int, int, System::Details::StackArray\<uint8_t, SB\>\&, int) method


Bir karakter tamponunu kodlamanın sonucunda oluşan baytları alın.

```cpp
template<std::size_t,std::size_t> int System::Text::Encoding::GetBytes(System::Details::StackArray<char_t, SC> &chars, int char_index, int char_count, System::Details::StackArray<uint8_t, SB> &bytes, int byte_index)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| chars | System::Details::StackArray\<char_t, SC\>\& | Kodlanacak karakterler. |
| char_index | int | Karakter diliminin başlangıcı. |
| char_count | int | Dönüştürülecek karakter sayısı. |
| bytes | System::Details::StackArray\<uint8_t, SB\>\& | [Buffer](../../../system/buffer/) karakterleri koymak için. |
| byte_index | int | Çıktı tamponu ofseti. |

### ReturnValue

Yazılan bayt sayısı.

## Ayrıca Bakınız

* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
