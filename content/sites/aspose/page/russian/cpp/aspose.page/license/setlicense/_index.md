---
title: "Aspose::Page::License::SetLicense метод"
linktitle: "SetLicense"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::License::SetLicense метод. Лицензирует компонент в C++."
type: docs
weight: 400
url: /ru/cpp/aspose.page/license/setlicense/
---
## License::SetLicense(System::SharedPtr\<System::IO::Stream\>) method


Лицензирует компонент.

```cpp
void Aspose::Page::License::SetLicense(System::SharedPtr<System::IO::Stream> stream)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| поток | System::SharedPtr\<System::IO::Stream\> | Поток, содержащий лицензию. |
## Примечания



Используйте этот метод для загрузки лицензии из потока.

<javaName>void setLicense(java.io.InputStream stream)</javaName>
## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [License](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
## License::SetLicense(System::String) method


Лицензирует компонент.

```cpp
void Aspose::Page::License::SetLicense(System::String licenseName)
```

## Примечания


Пытается найти лицензию в следующих местах:

1. Явный путь.

<ms>

2. Папка сборки компонента.

3. Папка вызывающей сборки клиента.

4. Папка входной сборки.

5. Встроенный ресурс в вызывающей сборке клиента.

**Note:**On the .NET Compact Framework, tries to find the license only in these locations:

1. Явный путь.

2. Встроенный ресурс в вызывающей сборке клиента.

</ms>

<java>

2. Папка jar-файла компонента.

</java>
## См. также

* Class [String](../../../system/string/)
* Class [License](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
