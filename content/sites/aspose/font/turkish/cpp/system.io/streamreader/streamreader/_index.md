---
title: "System::IO::StreamReader::StreamReader constructor"
linktitle: "StreamReader"
second_title: "Aspose.Font için C++"
description: "System::IO::StreamReader::StreamReader constructor. C++'ta UTF-8 kodlamasını kullanan ve varsayılan 1024 bayt boyutunda bir tamponla belirtilen temel akıştan karakter okuyan bir StreamReader nesnesi örneği oluşturur."
type: docs
weight: 100
url: /tr/cpp/system.io/streamreader/streamreader/
---
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&) constructor


Belirtilen temel akıştan UTF-8 kodlamasını kullanarak ve varsayılan 1024 bayt tampon boyutuyla karakter okuyan bir [StreamReader](../) nesnesinin bir örneğini oluşturur.

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| akış | const SharedPtr\<Stream\>\& | Karakterlerin okunacağı temel akış |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&, bool) constructor


Belirtilen temel akıştan UTF-8 kodlamasını kullanarak ve varsayılan 1024 bayt tampon boyutuyla karakter okuyan bir [StreamReader](../) nesnesinin örneğini oluşturur. Bir parametre, bayt sırası işareti algılamasının etkinleştirilip etkinleştirilmeyeceğini belirtir.

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream, bool detectEncodingFromByteOrderMarks)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| akış | const SharedPtr\<Stream\>\& | Karakterlerin okunacağı temel akış |
| detectEncodingFromByteOrderMarks | bool | Akışın başında bayt sırası işaretlerini aramak için doğru, aksi takdirde - yanlış |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&, const EncodingPtr\&) constructor


Belirtilen temel akıştan belirtilen kodlamayı kullanarak ve varsayılan 1024 bayt tampon boyutuyla karakter okuyan bir [StreamReader](../) nesnesinin örneğini oluşturur.

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream, const EncodingPtr &encoding)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| akış | const SharedPtr\<Stream\>\& | Karakterlerin okunacağı temel akış |
| encoding | const EncodingPtr\& | Kullanılacak kodlama |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&, const EncodingPtr\&, bool) constructor


Belirtilen temel akıştan belirtilen kodlamayı kullanarak ve varsayılan 1024 bayt tampon boyutuyla karakter okuyan bir [StreamReader](../) nesnesinin örneğini oluşturur. Bir parametre, bayt sırası işareti algılamasının etkinleştirilip etkinleştirilmeyeceğini belirtir.

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream, const EncodingPtr &encoding, bool detectEncodingFromByteOrderMarks)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| akış | const SharedPtr\<Stream\>\& | Karakterlerin okunacağı temel akış |
| encoding | const EncodingPtr\& | Kullanılacak kodlama |
| detectEncodingFromByteOrderMarks | bool | Akışın başında bayt sırası işaretlerini aramak için doğru, aksi takdirde - yanlış |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&, const EncodingPtr\&, bool, int) constructor


Belirtilen temel akıştan belirtilen kodlamayı kullanarak ve belirtilen boyutta bir tamponla karakter okuyan bir [StreamReader](../) nesnesinin örneğini oluşturur. Bir parametre, bayt sırası işareti algılamasının etkinleştirilip etkinleştirilmeyeceğini belirtir.

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream, const EncodingPtr &encoding, bool detectEncodingFromByteOrderMarks, int bufferSize)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| akış | const SharedPtr\<Stream\>\& | Karakterlerin okunacağı temel akış |
| encoding | const EncodingPtr\& | Kullanılacak kodlama |
| detectEncodingFromByteOrderMarks | bool | Akışın başında bayt sırası işaretlerini aramak için doğru, aksi takdirde - yanlış |
| bufferSize | int | Tamponun bayt cinsinden minimum boyutu |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const System::String\&) constructor


Belirtilen dosyadan UTF-8 kodlamasını kullanarak ve varsayılan 4096 bayt tampon boyutuyla karakter okuyan bir [StreamReader](../) nesnesinin örneğini oluşturur.

```cpp
System::IO::StreamReader::StreamReader(const System::String &path)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| yol | const System::String\& | Karakterlerin okunacağı dosyanın yolu |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const System::String\&, bool) constructor


Belirtilen dosyadan UTF-8 kodlamasını kullanarak ve varsayılan 4096 bayt tampon boyutuyla karakter okuyan bir [StreamReader](../) nesnesinin örneğini oluşturur. Bir parametre, bayt sırası işareti algılamasının etkinleştirilip etkinleştirilmeyeceğini belirtir.

```cpp
System::IO::StreamReader::StreamReader(const System::String &path, bool detectEncodingFromByteOrderMarks)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| yol | const System::String\& | Karakterlerin okunacağı dosyanın yolu |
| detectEncodingFromByteOrderMarks | bool | Dosyanın başında bayt sırası işaretlerini aramak için doğru, aksi takdirde - yanlış |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const System::String\&, const EncodingPtr\&) constructor


Belirtilen dosyadan belirtilen kodlamayı kullanarak ve varsayılan 4096 bayt tampon boyutuyla karakter okuyan bir [StreamReader](../) nesnesinin örneğini oluşturur.

```cpp
System::IO::StreamReader::StreamReader(const System::String &path, const EncodingPtr &encoding)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| yol | const System::String\& | Karakterlerin okunacağı dosyanın yolu |
| encoding | const EncodingPtr\& | Kullanılacak kodlama |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const System::String\&, const EncodingPtr\&, bool) constructor


Belirtilen temel akıştan belirtilen kodlamayı kullanarak ve varsayılan 4096 bayt tampon boyutuyla karakter okuyan bir [StreamReader](../) nesnesinin örneğini oluşturur. Bir parametre, bayt sırası işareti algılamasının etkinleştirilip etkinleştirilmeyeceğini belirtir.

```cpp
System::IO::StreamReader::StreamReader(const System::String &path, const EncodingPtr &encoding, bool detectEncodingFromByteOrderMarks)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| yol | const System::String\& | Karakterlerin okunacağı dosyanın yolu |
| encoding | const EncodingPtr\& | Kullanılacak kodlama |
| detectEncodingFromByteOrderMarks | bool | Dosyanın başında bayt sırası işaretlerini aramak için doğru, aksi takdirde - yanlış |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const System::String\&, const EncodingPtr\&, bool, int) constructor


Belirtilen dosyadan belirtilen kodlamayı kullanarak ve belirtilen boyutta bir tamponla karakter okuyan bir [StreamReader](../) nesnesinin örneğini oluşturur. Bir parametre, bayt sırası işareti algılamasının etkinleştirilip etkinleştirilmeyeceğini belirtir.

```cpp
System::IO::StreamReader::StreamReader(const System::String &path, const EncodingPtr &encoding, bool detectEncodingFromByteOrderMarks, int bufferSize)
```


| Parametre | Tür | Açıklama |
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
* Library [Aspose.Font for C++](../../../)
