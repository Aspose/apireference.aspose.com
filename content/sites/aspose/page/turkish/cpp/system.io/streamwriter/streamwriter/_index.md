---
title: "System::IO::StreamWriter::StreamWriter yapıcı"
linktitle: "StreamWriter"
second_title: "Aspose.Page için C++"
description: "System::IO::StreamWriter::StreamWriter yapıcı. C++'da UTF-8 kodlaması ve varsayılan 1024 bayt boyutundaki bir tampon kullanarak belirtilen temel akışa karakter yazan bir StreamWriter nesnesi örneği oluşturur."
type: docs
weight: 100
url: /tr/cpp/system.io/streamwriter/streamwriter/
---
## StreamWriter::StreamWriter(const SharedPtr\<Stream\>\&) constructor


UTF-8 kodlaması ve varsayılan 1024 bayt boyutundaki bir tampon kullanarak belirtilen temel akışa karakter yazan bir [StreamWriter](../) nesnesi örneği oluşturur.

```cpp
System::IO::StreamWriter::StreamWriter(const SharedPtr<Stream> &stream)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| akış | const SharedPtr\<Stream\>\& | Karakterleri yazmak için kullanılan temel akış |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::StreamWriter(const SharedPtr\<Stream\>\&, const EncodingPtr\&) constructor


Belirtilen kodlamayı kullanarak ve varsayılan 1024 bayt boyutundaki bir tamponla, belirtilen temel akışa karakter yazan bir [StreamWriter](../) nesnesi örneği oluşturur.

```cpp
System::IO::StreamWriter::StreamWriter(const SharedPtr<Stream> &stream, const EncodingPtr &encoding)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| akış | const SharedPtr\<Stream\>\& | Karakterleri yazmak için kullanılan temel akış |
| encoding | const EncodingPtr\& | Kullanılacak kodlama |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::StreamWriter(const SharedPtr\<Stream\>\&, const EncodingPtr\&, int, bool) constructor


Belirtilen kodlamayı ve belirtilen boyuttaki bir tamponu kullanarak, belirtilen temel akışa karakter yazan bir [StreamWriter](../) nesnesi örneği oluşturur. Bir parametre, [StreamWriter](../) nesnesi yok edildiğinde temel akışın kapatılıp kapatılmayacağını belirtir.

```cpp
System::IO::StreamWriter::StreamWriter(const SharedPtr<Stream> &stream, const EncodingPtr &encoding, int buffer_size, bool leave_open=false)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| akış | const SharedPtr\<Stream\>\& | Karakterleri yazmak için kullanılan temel akış |
| encoding | const EncodingPtr\& | Kullanılacak kodlama |
| buffer_size | int | Tamponun bayt cinsinden minimum boyutu |
| leave_open | bool | Mevcut [StreamWriter](../) nesnesi yok edildikten sonra temel akışın açık bırakılıp bırakılmayacağını belirtir |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::StreamWriter(const String\&) constructor


UTF-8 kodlamasını ve varsayılan 1024 bayt boyutundaki bir tamponu kullanarak, belirtilen dosyaya karakter yazan bir [StreamWriter](../) nesnesi örneği oluşturur.

```cpp
System::IO::StreamWriter::StreamWriter(const String &path)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| yol | const String\& | Karakterlerin yazılacağı dosyanın yolu |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::StreamWriter(const String\&, bool, const EncodingPtr\&, int) constructor


Belirtilen kodlamayı ve tampon boyutunu kullanarak, belirtilen dosyaya karakter yazan bir [StreamWriter](../) nesnesi örneği oluşturur. Bir parametre, verinin dosyaya eklenip eklenmeyeceğini veya dosyanın üzerine yazılıp yazılmayacağını belirtir.

```cpp
System::IO::StreamWriter::StreamWriter(const String &path, bool append, const EncodingPtr &encoding, int buffer_size)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| yol | const String\& | Karakterlerin yazılacağı dosyanın yolu |
| append | bool | Verinin belirtilen dosyaya eklenip eklenmeyeceğini (true) veya dosyanın üzerine yazılıp yazılmayacağını (false) belirtir |
| encoding | const EncodingPtr\& | Kullanılacak kodlama |
| buffer_size | int | Kullanılacak tamponun boyutu |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::StreamWriter(const String\&, bool, const EncodingPtr\&) constructor


Belirtilen kodlamayı ve varsayılan 1024 bayt boyutundaki bir tamponu kullanarak, belirtilen dosyaya karakter yazan bir [StreamWriter](../) nesnesi örneği oluşturur. Bir parametre, verinin dosyaya eklenip eklenmeyeceğini veya dosyanın üzerine yazılıp yazılmayacağını belirtir.

```cpp
System::IO::StreamWriter::StreamWriter(const String &path, bool append, const EncodingPtr &encoding=System::Text::Encoding::get_UTF8Unmarked())
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| yol | const String\& | Karakterlerin yazılacağı dosyanın yolu |
| append | bool | Verinin belirtilen dosyaya eklenip eklenmeyeceğini (true) veya dosyanın üzerine yazılıp yazılmayacağını (false) belirtir |
| encoding | const EncodingPtr\& | Kullanılacak kodlama |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
