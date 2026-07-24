---
title: "System::Text::Encoding::GetChars metodu"
linktitle: "GetChars"
second_title: "Aspose.Page için C++"
description: "System::Text::Encoding::GetChars metodu. C++'de bir bayt tamponunun çözülmesinden elde edilen karakterleri alır."
type: docs
weight: 2000
url: /tr/cpp/system.text/encoding/getchars/
---
## Encoding::GetChars(ArrayPtr\<uint8_t\>) method


Bir bayt tamponunu çözmenin sonucunda oluşan karakterleri alın.

```cpp
virtual ArrayPtr<char_t> System::Text::Encoding::GetChars(ArrayPtr<uint8_t> bytes)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) baytları okumak için. |

### ReturnValue

[Buffer](../../../system/buffer/) of decoded characters.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoding::GetChars(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) method


Bir bayt tamponunu çözmenin sonucunda oluşan karakterleri alın.

```cpp
virtual int System::Text::Encoding::GetChars(ArrayPtr<uint8_t> bytes, int byte_index, int byte_count, ArrayPtr<char_t> chars, int char_index)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) baytları okumak için. |
| byte_index | int | Giriş tamponu ofseti. |
| byte_count | int | Giriş tamponu boyutu. |
| chars | ArrayPtr\<char_t\> | [Buffer](../../../system/buffer/) karakter koymak için. |
| char_index | int | Çıkış tamponu ofseti. |

### ReturnValue

Yazılan karakter sayısı.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoding::GetChars(ArrayPtr\<uint8_t\>, int, int) method


Bir bayt tamponunu çözmenin sonucunda oluşan karakterleri alın.

```cpp
virtual ArrayPtr<char_t> System::Text::Encoding::GetChars(ArrayPtr<uint8_t> bytes, int index, int count)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) baytları okumak için. |
| indeks | int | Giriş tamponu ofseti. |
| count | int | Giriş tamponu boyutu. |

### ReturnValue

[Buffer](../../../system/buffer/) of decoded characters.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoding::GetChars(const uint8_t *, int, char_t *, int) method


Bir bayt tamponunu çözmenin sonucunda oluşan karakterleri alın.

```cpp
virtual int System::Text::Encoding::GetChars(const uint8_t *bytes, int byte_count, char_t *chars, int char_count)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| bytes | const uint8_t * | [Buffer](../../../system/buffer/) baytları okumak için. |
| byte_count | int | Giriş tamponu boyutu. |
| chars | char_t * | [Buffer](../../../system/buffer/) karakter koymak için. |
| char_count | int | Çıktı tamponu boyutu. |

### ReturnValue

Yazılan karakter sayısı.

## Ayrıca Bakınız

* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
