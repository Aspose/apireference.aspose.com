---
title: "System::IO::StreamWriter::WriteLine method"
linktitle: "WriteLine"
second_title: "Aspose.Page için C++"
description: "System::IO::StreamWriter::WriteLine yöntemi. C++'ta akışa satır sonu karakterleri yazar."
type: docs
weight: 1100
url: /tr/cpp/system.io/streamwriter/writeline/
---
## StreamWriter::WriteLine() method


Satır sonlandırıcı karakterlerini akışa yazar.

```cpp
void System::IO::StreamWriter::WriteLine() override
```

## Ayrıca Bakınız

* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::WriteLine(const ArrayPtr\<char_t\>\&) method


Belirtilen diziden tüm karakterleri, satır sonlandırma karakterlerinden sonra akışa yazar.

```cpp
void System::IO::StreamWriter::WriteLine(const ArrayPtr<char_t> &buffer) override
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| tampon | const ArrayPtr\<char_t\>\& | Yazılacak karakterleri içeren dizi |

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::WriteLine(const ArrayPtr\<char_t\>\&, int32_t, int32_t) method


Belirtilen karakter dizisinden UTF-16 karakterlerinin belirtilen alt aralığını, satır sonlandırma karakterlerinden sonra akışa yazar.

```cpp
void System::IO::StreamWriter::WriteLine(const ArrayPtr<char_t> &buffer, int32_t index, int32_t count) override
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| tampon | const ArrayPtr\<char_t\>\& | Yazılacak karakterleri içeren dizi |
| indeks | int32_t | Yazılacak alt aralığın başladığı **buffer** içindeki 0 tabanlı indeks |
| count | int32_t | Yazılacak alt aralıktaki karakter sayısı; -1, alt aralığın **buffer** dizisinin sonuna kadar devam ettiğini belirtir |

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::WriteLine(const char_t *) method


Belirtilen C-dizisini, satır sonlandırma karakterlerinden sonra akışa yazar.

```cpp
void System::IO::StreamWriter::WriteLine(const char_t *buffer) override
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| tampon | const char_t * | Yazılacak c-dizgesi |

## Ayrıca Bakınız

* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::WriteLine(const SharedPtr\<Object\>\&) method


Belirtilen nesnenin dize temsilini, ardından satır sonlandırıcı karakterleriyle birlikte akışa yazar.

```cpp
void System::IO::StreamWriter::WriteLine(const SharedPtr<Object> &obj) override
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| obj | const SharedPtr\<Object\>\& | Yazılacak nesne |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::WriteLine(const String\&) method


Belirtilen dizeyi, satır sonlandırma karakterlerinden sonra akışa yazar.

```cpp
void System::IO::StreamWriter::WriteLine(const String &value) override
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| değer | const String\& | Yazılacak dize |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::WriteLine(const System::SharedPtr\<T\>\&) method


Belirtilen nesnenin dize temsilini, ardından satır sonlandırıcı karakterleriyle birlikte akışa yazar.

```cpp
template<typename T> void System::IO::StreamWriter::WriteLine(const System::SharedPtr<T> &obj)
```


| Parameter | Açıklama |
| --- | --- |
| T | Nesnenin tipi |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| obj | const System::SharedPtr\<T\>\& | Yazılacak nesne |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
