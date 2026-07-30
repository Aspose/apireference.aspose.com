---
title: "System::IO::StreamWriter::StreamWriter yapıcı"
linktitle: "StreamWriter"
second_title: "Aspose.Font için C++"
description: "System::IO::StreamWriter::StreamWriter yapıcı. C++'ta UTF-8 kodlamasını kullanarak ve varsayılan 1024 bayt boyutundaki bir tamponla belirtilen temel akışa karakterler yazan bir StreamWriter nesnesi örneği oluşturur."
type: docs
weight: 100
url: /tr/cpp/system.io/streamwriter/streamwriter/
---
## StreamWriter::StreamWriter(const SharedPtr\<Stream\>\&) constructor


UTF-8 kodlamasını kullanarak ve varsayılan 1024 bayt boyutundaki bir tamponla belirtilen temel akışa karakterler yazan bir [StreamWriter](../) nesnesi örneği oluşturur.

```cpp
System::IO::StreamWriter::StreamWriter(const SharedPtr<Stream> &stream)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| akış | const SharedPtr\<Stream\>\& | Karakterlerin yazılacağı temel akış |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::StreamWriter(const SharedPtr\<Stream\>\&, const EncodingPtr\&) constructor


Belirtilen kodlamayı kullanarak ve varsayılan 1024 bayt boyutundaki bir tamponla belirtilen temel akışa karakterler yazan bir [StreamWriter](../) nesnesi örneği oluşturur.

```cpp
System::IO::StreamWriter::StreamWriter(const SharedPtr<Stream> &stream, const EncodingPtr &encoding)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| akış | const SharedPtr\<Stream\>\& | Karakterlerin yazılacağı temel akış |
| encoding | const EncodingPtr\& | Kullanılacak kodlama |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::StreamWriter(const SharedPtr\<Stream\>\&, const EncodingPtr\&, int, bool) constructor


Belirtilen kodlamayı ve belirtilen boyuttaki bir tamponu kullanarak belirtilen temel akışa karakter yazan bir [StreamWriter](../) nesnesinin bir örneğini oluşturur. Bir parametre, [StreamWriter](../) nesnesi dağıtıldığında temel akışın kapatılıp kapatılmayacağını belirtir.

```cpp
System::IO::StreamWriter::StreamWriter(const SharedPtr<Stream> &stream, const EncodingPtr &encoding, int buffer_size, bool leave_open=false)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| akış | const SharedPtr\<Stream\>\& | Karakterlerin yazılacağı temel akış |
| encoding | const EncodingPtr\& | Kullanılacak kodlama |
| buffer_size | int | Tamponun bayt cinsinden minimum boyutu |
| leave_open | bool | Mevcut [StreamWriter](../) nesnesi dağıtıldıktan sonra temel akışın açık bırakılıp bırakılmayacağını belirtir |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::StreamWriter(const String\&) constructor


UTF-8 kodlamasını ve 1024 bayt varsayılan boyutlu bir tamponu kullanarak belirtilen dosyaya karakter yazan bir [StreamWriter](../) nesnesinin bir örneğini oluşturur.

```cpp
System::IO::StreamWriter::StreamWriter(const String &path)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| yol | const String\& | Karakterlerin yazılacağı dosyanın yolu |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::StreamWriter(const String\&, bool, const EncodingPtr\&, int) constructor


Belirtilen kodlamayı ve tampon boyutunu kullanarak belirtilen dosyaya karakter yazan bir [StreamWriter](../) nesnesinin bir örneğini oluşturur. Bir parametre, verilerin dosyaya eklenip eklenmeyeceğini veya dosyanın üzerine yazılıp yazılmayacağını belirtir.

```cpp
System::IO::StreamWriter::StreamWriter(const String &path, bool append, const EncodingPtr &encoding, int buffer_size)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| yol | const String\& | Karakterlerin yazılacağı dosyanın yolu |
| append | bool | Verilerin belirtilen dosyaya eklenip eklenmeyeceğini (true) veya dosyanın üzerine yazılıp yazılmayacağını (false) belirtir |
| encoding | const EncodingPtr\& | Kullanılacak kodlama |
| buffer_size | int | Kullanılacak tamponun boyutu |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::StreamWriter(const String\&, bool, const EncodingPtr\&) constructor


Belirtilen kodlamayı ve 1024 bayt varsayılan boyutlu bir tamponu kullanarak belirtilen dosyaya karakter yazan bir [StreamWriter](../) nesnesinin bir örneğini oluşturur. Bir parametre, verilerin dosyaya eklenip eklenmeyeceğini veya dosyanın üzerine yazılıp yazılmayacağını belirtir.

```cpp
System::IO::StreamWriter::StreamWriter(const String &path, bool append, const EncodingPtr &encoding=System::Text::Encoding::get_UTF8Unmarked())
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| yol | const String\& | Karakterlerin yazılacağı dosyanın yolu |
| append | bool | Verilerin belirtilen dosyaya eklenip eklenmeyeceğini (true) veya dosyanın üzerine yazılıp yazılmayacağını (false) belirtir |
| encoding | const EncodingPtr\& | Kullanılacak kodlama |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
