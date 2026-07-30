---
title: "System::IO::FileSystemInfo sınıfı"
linktitle: "FileSystemInfo"
second_title: "Aspose.Font için C++"
description: "System::IO::FileSystemInfo sınıfı. FileInfo ve DirectoryInfo için temel sınıf. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığıt üzerinde veya new operatörüyle oluşturulmamalıdır, aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 1600
url: /tr/cpp/system.io/filesysteminfo/
---
## FileSystemInfo class


[FileInfo](../fileinfo/) ve [DirectoryInfo](../directoryinfo/) için temel sınıf. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığıt üzerinde veya new operatörüyle oluşturulmamalıdır, aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class FileSystemInfo : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [Delete](./delete/)() | Geçerli nesne tarafından temsil edilen varlığı siler. |
| virtual [Finalize](./finalize/)() | Hiçbir şey yapmaz. |
| [get_Attributes](./get_attributes/)() | Geçerli nesne tarafından temsil edilen varlığın özniteliklerini döndürür. |
| [get_CreationTime](./get_creationtime/)() | Geçerli nesne tarafından temsil edilen varlığın oluşturulma zamanını yerel saat olarak döndürür. |
| [get_CreationTimeUtc](./get_creationtimeutc/)() | Geçerli nesne tarafından temsil edilen varlığın oluşturulma zamanını UTC saat olarak döndürür. |
| virtual [get_Exists](./get_exists/)() | Geçerli nesne tarafından temsil edilen yolun referans verdiği varlığın var olup olmadığını belirler. |
| [get_Extension](./get_extension/)() | Geçerli nesne tarafından temsil edilen dosyanın uzantısını döndürür. |
| virtual [get_FullName](./get_fullname/)() | Geçerli nesne tarafından temsil edilen varlığın tam adını (yolu dahil) döndürür. |
| [get_LastAccessTime](./get_lastaccesstime/)() | Geçerli nesne tarafından temsil edilen varlığın son erişim zamanını yerel saat olarak döndürür. |
| [get_LastAccessTimeUtc](./get_lastaccesstimeutc/)() | Geçerli nesne tarafından temsil edilen varlığın son erişim zamanını UTC zamanı olarak döndürür. |
| [get_LastWriteTime](./get_lastwritetime/)() | Geçerli nesne tarafından temsil edilen varlığın son yazma zamanını yerel zaman olarak döndürür. |
| [get_LastWriteTimeUtc](./get_lastwritetimeutc/)() | Geçerli nesne tarafından temsil edilen varlığın son yazma zamanını UTC zamanı olarak döndürür. |
| virtual [get_Name](./get_name/)() | Geçerli nesne tarafından temsil edilen varlığın adını döndürür. |
| [Refresh](./refresh/)() | Geçerli nesnenin durumunu yeniler. |
| [set_Attributes](./set_attributes/)(FileAttributes) | Geçerli nesne tarafından temsil edilen varlık üzerine belirtilen öznitelikleri ayarlar. |
| [set_CreationTime](./set_creationtime/)(DateTime) | Geçerli nesne tarafından temsil edilen varlığın oluşturulma zamanını yerel zaman olarak ayarlar. |
| [set_CreationTimeUtc](./set_creationtimeutc/)(DateTime) | Geçerli nesne tarafından temsil edilen varlığın oluşturulma zamanını UTC zamanı olarak ayarlar. |
| [set_LastAccessTime](./set_lastaccesstime/)(DateTime) | Geçerli nesne tarafından temsil edilen varlığın son erişim zamanını yerel zaman olarak ayarlar. |
| [set_LastAccessTimeUtc](./set_lastaccesstimeutc/)(DateTime) | Geçerli nesne tarafından temsil edilen varlığın son erişim zamanını UTC zamanı olarak ayarlar. |
| [set_LastWriteTime](./set_lastwritetime/)(DateTime) | Geçerli nesne tarafından temsil edilen varlığın son yazma zamanını yerel zaman olarak ayarlar. |
| [set_LastWriteTimeUtc](./set_lastwritetimeutc/)(DateTime) | Geçerli nesne tarafından temsil edilen varlığın son yazma zamanını UTC zamanı olarak ayarlar. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
