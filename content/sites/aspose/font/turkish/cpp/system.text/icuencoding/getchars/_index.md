---
title: "System::Text::ICUEncoding::GetChars metodu"
linktitle: "GetChars"
second_title: "Aspose.Font için C++"
description: "System::Text::ICUEncoding::GetChars metodu. C++'de bir bayt tamponunun kod çözümlemesinden elde edilen karakterleri al."
type: docs
weight: 500
url: /tr/cpp/system.text/icuencoding/getchars/
---
## ICUEncoding::GetChars(ArrayPtr\<uint8_t\>) method


Bir bayt tamponunu çözmenin sonucunda oluşan karakterleri alın.

```cpp
virtual ArrayPtr<char_t> System::Text::Encoding::GetChars(ArrayPtr<uint8_t> bytes)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) baytları okumak için. |

### ReturnValue

[Buffer](../../../system/buffer/) of decoded characters.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUEncoding::GetChars(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) method


Bir bayt tamponunu çözmenin sonucunda oluşan karakterleri alın.

```cpp
virtual int System::Text::Encoding::GetChars(ArrayPtr<uint8_t> bytes, int byte_index, int byte_count, ArrayPtr<char_t> chars, int char_index)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) baytları okumak için. |
| byte_index | int | Giriş tamponu ofseti. |
| byte_count | int | Giriş tamponu boyutu. |
| chars | ArrayPtr\<char_t\> | [Buffer](../../../system/buffer/) karakterleri koymak için. |
| char_index | int | Çıktı tamponu ofseti. |

### ReturnValue

Yazılan karakter sayısı.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUEncoding::GetChars(ArrayPtr\<uint8_t\>, int, int) method


Bir bayt tamponunu çözmenin sonucunda oluşan karakterleri alın.

```cpp
virtual ArrayPtr<char_t> System::Text::Encoding::GetChars(ArrayPtr<uint8_t> bytes, int index, int count)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) baytları okumak için. |
| indeks | int | Giriş tamponu ofseti. |
| count | int | Giriş tamponu boyutu. |

### ReturnValue

[Buffer](../../../system/buffer/) of decoded characters.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUEncoding::GetChars(const uint8_t *, int, char_t *, int) method


Bir bayt tamponunu çözmenin sonucunda oluşan karakterleri alın.

```cpp
int System::Text::ICUEncoding::GetChars(const uint8_t *bytes, int byte_count, char_t *chars, int char_count) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| bytes | const uint8_t * | [Buffer](../../../system/buffer/) baytları okumak için. |
| byte_count | int | Giriş tamponu boyutu. |
| chars | char_t * | [Buffer](../../../system/buffer/) karakterleri koymak için. |
| char_count | int | Çıktı tamponu boyutu. |

### ReturnValue

Yazılan karakter sayısı.

## Ayrıca Bakınız

* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
