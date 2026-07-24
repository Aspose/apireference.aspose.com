---
title: "System::IO::FileStream::FileStream constructor"
linktitle: "FileStream"
second_title: "Aspose.Page için C++"
description: "System::IO::FileStream sınıfının FileStream yapıcısını C++'da nasıl kullanılır?"
type: docs
weight: 100
url: /tr/cpp/system.io/filestream/filestream/
---
## FileStream::FileStream(const FileStream\&) constructor




```cpp
System::IO::FileStream::FileStream(const FileStream &)=delete
```

## Ayrıca Bakınız

* Class [FileStream](../)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## FileStream::FileStream(const String\&, FileMode) constructor


Yeni bir [FileStream](../) sınıf örneği oluşturur ve belirtilen parametrelerle başlatır.

```cpp
System::IO::FileStream::FileStream(const String &path, FileMode mode)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| yol | const String\& | Açılacak dosyanın yolu. |
| mod | FileMode | Dosyanın açılacağı modu belirtir. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## FileStream::FileStream(const String\&, FileMode, FileAccess, FileShare, int32_t, bool) constructor


Yeni bir [FileStream](../) sınıf örneği oluşturur ve belirtilen parametrelerle başlatır.

```cpp
System::IO::FileStream::FileStream(const String &path, FileMode mode, FileAccess access, FileShare share, int32_t buffer_size, bool useAsync)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| yol | const String\& | Açılacak dosyanın yolu. |
| mod | FileMode | Dosyanın açılacağı modu belirtir. |
| erişim | FileAccess | İstenen erişim türü. |
| share | FileShare | Diğer [FileStream](../) nesnelerinin açılan dosyaya sahip olduğu erişim türü. |
| buffer_size | int32_t | Okuma ve yazma işlemleri sırasında tamponlanan bayt sayısı. |
| useAsync | bool | Asenkron G/Ç mi yoksa senkron G/Ç mi kullanılacağını belirtir. |
## Açıklamalar



Altta yatan işletim sistemi asenkron G/Ç'yi desteklemeyebilir.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Enum [FileAccess](../../fileaccess/)
* Enum [FileShare](../../fileshare/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## FileStream::FileStream(const String\&, FileMode, FileAccess, FileShare, int32_t, FileOptions) constructor


Yeni bir [FileStream](../) sınıf örneği oluşturur ve belirtilen parametrelerle başlatır.

```cpp
System::IO::FileStream::FileStream(const String &path, FileMode mode, FileAccess access, FileShare share=FileShare::Read, int32_t buffer_size=DefaultBufferSize, FileOptions options=FileOptions::SequentialScan)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| yol | const String\& | Açılacak dosyanın yolu. |
| mod | FileMode | Dosyanın açılacağı modu belirtir. |
| erişim | FileAccess | İstenen erişim türü. |
| share | FileShare | Diğer [FileStream](../) nesnelerinin açılan dosyaya sahip olduğu erişim türü. |
| buffer_size | int32_t | Okuma ve yazma işlemleri sırasında tamponlanan bayt sayısı. |
| seçenekler | FileOptions | Ek seçenekler. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Enum [FileAccess](../../fileaccess/)
* Enum [FileShare](../../fileshare/)
* Enum [FileOptions](../../fileoptions/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
