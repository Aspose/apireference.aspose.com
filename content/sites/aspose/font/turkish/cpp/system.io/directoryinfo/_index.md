---
title: "System::IO::DirectoryInfo sınıfı"
linktitle: "DirectoryInfo"
second_title: "Aspose.Font için C++"
description: "System::IO::DirectoryInfo sınıfı. Bir dosya sistemi yolunu, bu yolla başvurulan bir dizini temsil eder ve dizinleri yönetmek için örnek yöntemler sağlar. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığıt (stack) üzerinde veya operator new kullanarak oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarmalayın ve bu işaretçiyi C++'ta işlevlere argüman olarak geçirmek için kullanın."
type: docs
weight: 1200
url: /tr/cpp/system.io/directoryinfo/
---
## DirectoryInfo class


Bir dosya sistemi yolunu, bu yolla başvurulan bir dizini temsil eder ve dizinleri yönetmek için örnek yöntemler sağlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığıt üzerinde veya operator new kullanarak oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarmalayın ve bu işaretçiyi işlevlere argüman olarak geçirmek için kullanın.

```cpp
class DirectoryInfo : public System::IO::FileSystemInfo
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Create](./create/)() | Geçerli nesne tarafından temsil edilen yolda bir dizin oluşturur. |
| [CreateSubdirectory](./createsubdirectory/)(const String\&) | Belirtilen yolda alt dizinler oluşturur. |
| [Delete](./delete/)() override | Geçerli nesne tarafından temsil edilen yoldaki dizin boşsa, dizini kaldırır. |
| [Delete](./delete/)(bool) | Geçerli nesne tarafından temsil edilen yoldaki dizini kaldırır. Bir parametre, dizin boş değilse içeriğin yinelemeli olarak kaldırılıp kaldırılmayacağını belirtir. |
| [DirectoryInfo](./directoryinfo/)(const String\&) | Belirtilen yolda [DirectoryInfo](./) sınıfının bir örneğini oluşturur. |
| [EnumerateDirectories](./enumeratedirectories/)() | Geçerli nesne tarafından temsil edilen dizinde bulunan tüm dizinleri içeren yinelemeli bir koleksiyon döndürür. |
| [EnumerateDirectories](./enumeratedirectories/)(const String\&) | Geçerli nesne tarafından temsil edilen dizinde belirtilen arama kriterlerini karşılayan dizinleri arar. |
| [EnumerateDirectories](./enumeratedirectories/)(const String\&, SearchOption) | Geçerli nesne tarafından temsil edilen dizinde veya bu dizinden kök alan tüm dizin ağacında belirtilen arama kriterlerini karşılayan dizinleri arar. |
| [EnumerateFiles](./enumeratefiles/)() | Geçerli nesne tarafından temsil edilen dizinde bulunan tüm dosyaları içeren yinelemeli bir koleksiyon döndürür. |
| [EnumerateFiles](./enumeratefiles/)(const String\&) | Geçerli nesne tarafından temsil edilen dizinde belirtilen arama kriterlerini karşılayan dosyaları arar. |
| [EnumerateFiles](./enumeratefiles/)(const String\&, SearchOption) | Geçerli nesne tarafından temsil edilen dizinde veya bu dizinden kök alan tüm dizin ağacında belirtilen arama kriterlerini karşılayan dosyaları arar. |
| [EnumerateFileSystemInfos](./enumeratefilesysteminfos/)() | Geçerli nesne tarafından temsil edilen dizinde bulunan tüm dosya ve dizinleri içeren yinelenebilir bir koleksiyon döndürür. |
| [EnumerateFileSystemInfos](./enumeratefilesysteminfos/)(const String\&) | Geçerli nesne tarafından temsil edilen dizinde belirtilen arama kriterlerini karşılayan dosya ve dizinleri arar. |
| [EnumerateFileSystemInfos](./enumeratefilesysteminfos/)(const String\&, SearchOption) | Geçerli nesne tarafından temsil edilen dizinde ya da bu nesnenin temsil ettiği dizinden kök alan tüm dizin ağacında belirtilen arama kriterlerini karşılayan dosya ve dizinleri arar. |
| [get_Exists](./get_exists/)() override | Geçerli nesne tarafından temsil edilen yolun mevcut bir dizine işaret edip etmediğini belirler. |
| [get_Name](./get_name/)() override | Geçerli nesne tarafından temsil edilen yolun işaret ettiği varlığın adını döndürür. |
| [get_Parent](./get_parent/)() | Geçerli nesne tarafından temsil edilen dizinin üst dizinine işaret eden bir yolu temsil eden [DirectoryInfo](./) nesnesine ortak bir işaretçi döndürür. |
| [get_Root](./get_root/)() | Geçerli nesne tarafından temsil edilen dizinin kök dizinine işaret eden bir yolu temsil eden [DirectoryInfo](./) nesnesine ortak bir işaretçi döndürür. |
| [GetDirectories](./getdirectories/)() | Geçerli nesne tarafından temsil edilen dizinde bulunan tüm dizinleri temsil eden [DirectoryInfo](./) nesnelerine ortak işaretçiler içeren bir dizi döndürür. |
| [GetDirectories](./getdirectories/)(const String\&) | Geçerli nesne tarafından temsil edilen dizinde belirtilen arama kriterlerini karşılayan dizinleri arar. |
| [GetDirectories](./getdirectories/)(const String\&, SearchOption) | Geçerli nesne tarafından temsil edilen dizinde veya bu dizinden kök alan tüm dizin ağacında belirtilen arama kriterlerini karşılayan dizinleri arar. |
| [GetFiles](./getfiles/)() | Geçerli nesne tarafından temsil edilen dizinde bulunan tüm dizinleri temsil eden [FileInfo](../fileinfo/) nesnelerine ortak işaretçiler içeren bir dizi döndürür. |
| [GetFiles](./getfiles/)(const String\&) | Geçerli nesne tarafından temsil edilen dizinde belirtilen arama kriterlerini karşılayan dosyaları arar. |
| [GetFiles](./getfiles/)(const String\&, SearchOption) | Geçerli nesne tarafından temsil edilen dizinde veya bu dizinden kök alan tüm dizin ağacında belirtilen arama kriterlerini karşılayan dosyaları arar. |
| [GetFileSystemInfos](./getfilesysteminfos/)() | Geçerli nesne tarafından temsil edilen dizinde bulunan tüm dosya ve dizinleri temsil eden [FileSystemInfo](../filesysteminfo/) nesnelerine ortak işaretçiler içeren bir dizi döndürür. |
| [GetFileSystemInfos](./getfilesysteminfos/)(const String\&) | Geçerli nesne tarafından temsil edilen dizinde belirtilen arama kriterlerini karşılayan dosya ve dizinleri arar. |
| [GetFileSystemInfos](./getfilesysteminfos/)(const String\&, SearchOption) | Geçerli nesne tarafından temsil edilen dizinde ya da bu nesnenin temsil ettiği dizinden kök alan tüm dizin ağacında belirtilen arama kriterlerini karşılayan dosya ve dizinleri arar. |
| [MoveTo](./moveto/)(const String\&) | Geçerli nesne tarafından temsil edilen dizini ve tüm içeriğini belirtilen konuma taşır. |
| [ToString](./tostring/)() const override | Geçerli nesne tarafından temsil edilen yolu içeren bir dize döndürür. |
## Ayrıca Bakınız

* Class [FileSystemInfo](../filesysteminfo/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
