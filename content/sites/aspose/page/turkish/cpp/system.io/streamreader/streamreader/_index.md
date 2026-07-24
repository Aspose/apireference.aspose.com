---
title: "System::IO::StreamReader::StreamReader yapıcı"
linktitle: "StreamReader"
second_title: "Aspose.Page için C++"
description: "System::IO::StreamReader::StreamReader yapıcı. C++'da belirtilen temel akıştan UTF-8 kodlaması ve varsayılan 1024 bayt boyutundaki bir tampon kullanarak karakter okuyan bir StreamReader nesnesi örneği oluşturur."
type: docs
weight: 100
url: /tr/cpp/system.io/streamreader/streamreader/
---
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&) constructor


Belirtilen temel akıştan UTF-8 kodlaması ve varsayılan 1024 bayt boyutundaki bir tampon kullanarak karakter okuyan bir [StreamReader](../) nesnesi örneği oluşturur.

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| akış | const SharedPtr\<Stream\>\& | Karakterlerin okunacağı temel akış |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&, bool) constructor


Belirtilen temel akıştan UTF-8 kodlaması ve varsayılan 1024 bayt boyutundaki bir tampon kullanarak karakter okuyan bir [StreamReader](../) nesnesi örneği oluşturur. Bir parametre, bayt sırası işareti algılamasının etkinleştirilip etkinleştirilmeyeceğini belirtir.

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream, bool detectEncodingFromByteOrderMarks)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| akış | const SharedPtr\<Stream\>\& | Karakterlerin okunacağı temel akış |
| detectEncodingFromByteOrderMarks | bool | Akışın başında bayt sırası işaretlerini aramak için doğru, aksi takdirde yanlış |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&, const EncodingPtr\&) constructor


Belirtilen temel akıştan belirtilen kodlamayı ve varsayılan 1024 bayt boyutundaki bir tamponu kullanarak karakter okuyan bir [StreamReader](../) nesnesi örneği oluşturur.

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream, const EncodingPtr &encoding)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| akış | const SharedPtr\<Stream\>\& | Karakterlerin okunacağı temel akış |
| encoding | const EncodingPtr\& | Kullanılacak kodlama |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&, const EncodingPtr\&, bool) constructor


Belirtilen temel akıştan belirtilen kodlamayı ve varsayılan 1024 bayt boyutundaki bir tamponu kullanarak karakter okuyan bir [StreamReader](../) nesnesi örneği oluşturur. Bir parametre, bayt sırası işareti algılamasının etkinleştirilip etkinleştirilmeyeceğini belirtir.

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream, const EncodingPtr &encoding, bool detectEncodingFromByteOrderMarks)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| akış | const SharedPtr\<Stream\>\& | Karakterlerin okunacağı temel akış |
| encoding | const EncodingPtr\& | Kullanılacak kodlama |
| detectEncodingFromByteOrderMarks | bool | Akışın başında bayt sırası işaretlerini aramak için doğru, aksi takdirde yanlış |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&, const EncodingPtr\&, bool, int) constructor


Belirtilen temel akıştan belirtilen kodlamayı ve belirtilen boyuttaki bir tamponu kullanarak karakter okuyan bir [StreamReader](../) nesnesi örneği oluşturur. Bir parametre, bayt sırası işareti algılamasının etkinleştirilip etkinleştirilmeyeceğini belirtir.

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream, const EncodingPtr &encoding, bool detectEncodingFromByteOrderMarks, int bufferSize)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| akış | const SharedPtr\<Stream\>\& | Karakterlerin okunacağı temel akış |
| encoding | const EncodingPtr\& | Kullanılacak kodlama |
| detectEncodingFromByteOrderMarks | bool | Akışın başında bayt sırası işaretlerini aramak için doğru, aksi takdirde yanlış |
| bufferSize | int | Tamponun bayt cinsinden minimum boyutu |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const System::String\&) constructor


Belirtilen dosyadan UTF-8 kodlaması ve varsayılan 4096 bayt boyutundaki bir tampon kullanarak karakter okuyan bir [StreamReader](../) nesnesi örneği oluşturur.

```cpp
System::IO::StreamReader::StreamReader(const System::String &path)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| yol | const System::String\& | Karakterlerin okunacağı dosyanın yolu |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const System::String\&, bool) constructor


Belirtilen dosyadan UTF-8 kodlaması ve varsayılan 4096 bayt boyutundaki bir tampon kullanarak karakter okuyan bir [StreamReader](../) nesnesi örneği oluşturur. Bir parametre, bayt sırası işareti algılamasının etkinleştirilip etkinleştirilmeyeceğini belirtir.

```cpp
System::IO::StreamReader::StreamReader(const System::String &path, bool detectEncodingFromByteOrderMarks)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| yol | const System::String\& | Karakterlerin okunacağı dosyanın yolu |
| detectEncodingFromByteOrderMarks | bool | Dosyanın başında bayt sırası işaretlerini aramak için doğru, aksi takdirde - yanlış |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const System::String\&, const EncodingPtr\&) constructor


Belirtilen kodlamayı kullanarak belirtilen dosyadan karakter okuyan ve varsayılan 4096 bayt boyutundaki bir tampon kullanan [StreamReader](../) nesnesinin bir örneğini oluşturur.

```cpp
System::IO::StreamReader::StreamReader(const System::String &path, const EncodingPtr &encoding)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| yol | const System::String\& | Karakterlerin okunacağı dosyanın yolu |
| encoding | const EncodingPtr\& | Kullanılacak kodlama |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const System::String\&, const EncodingPtr\&, bool) constructor


Belirtilen kodlamayı kullanarak belirtilen temel akıştan karakter okuyan ve varsayılan 4096 bayt boyutundaki bir tampon kullanan [StreamReader](../) nesnesinin bir örneğini oluşturur. Bir parametre, bayt sırası işareti algılamasının etkinleştirilip etkinleştirilmeyeceğini belirtir.

```cpp
System::IO::StreamReader::StreamReader(const System::String &path, const EncodingPtr &encoding, bool detectEncodingFromByteOrderMarks)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| yol | const System::String\& | Karakterlerin okunacağı dosyanın yolu |
| encoding | const EncodingPtr\& | Kullanılacak kodlama |
| detectEncodingFromByteOrderMarks | bool | Dosyanın başında bayt sırası işaretlerini aramak için doğru, aksi takdirde - yanlış |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const System::String\&, const EncodingPtr\&, bool, int) constructor


Belirtilen kodlamayı kullanarak belirtilen dosyadan karakter okuyan ve belirtilen boyuttaki bir tampon kullanan [StreamReader](../) nesnesinin bir örneğini oluşturur. Bir parametre, bayt sırası işareti algılamasının etkinleştirilip etkinleştirilmeyeceğini belirtir.

```cpp
System::IO::StreamReader::StreamReader(const System::String &path, const EncodingPtr &encoding, bool detectEncodingFromByteOrderMarks, int bufferSize)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| yol | const System::String\& | Karakterlerin okunacağı dosyanın yolu |
| encoding | const EncodingPtr\& | Kullanılacak kodlama |
| detectEncodingFromByteOrderMarks | bool | Dosyanın başında bayt sırası işaretlerini aramak için doğru, aksi takdirde - yanlış |
| bufferSize | int | Tamponun bayt cinsinden minimum boyutu |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
