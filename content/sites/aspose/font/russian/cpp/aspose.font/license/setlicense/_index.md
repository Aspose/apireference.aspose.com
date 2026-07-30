---
title: "Aspose::Font::License::SetLicense метод"
linktitle: "SetLicense"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::License::SetLicense метод. Лицензирует компонент в C++."
type: docs
weight: 400
url: /ru/cpp/aspose.font/license/setlicense/
---
## License::SetLicense(System::SharedPtr\<System::IO::Stream\>) method


Лицензирует компонент.

```cpp
void Aspose::Font::License::SetLicense(System::SharedPtr<System::IO::Stream> stream)
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
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
## License::SetLicense(System::String) method


Лицензирует компонент.

```cpp
void Aspose::Font::License::SetLicense(System::String licenseName)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| licenseName | System::String | Может быть полным или коротким именем файла<ms> или именем встроенного ресурса</ms>. Используйте пустую строку, чтобы переключиться в режим оценки. |
## Примечания


Пытается найти лицензию в следующих местах:

1. Явный путь.

<ms>

2. Папка, содержащая сборку компонента **Aspose**.

3. Папка, содержащая вызывающую сборку клиента.

4. Папка, содержащая входную (запускаемую) сборку.

5. Встроенный ресурс в вызывающей сборке клиента.

**Note:**On the .NET Compact Framework, tries to find the license only in these locations:

1. Явный путь.

2. Встроенный ресурс в вызывающей сборке клиента.

</ms>

<java>

2. Папка, содержащая JAR‑файл компонента **Aspose**.

3. Папка, содержащая вызывающий JAR‑файл клиента.

</java>

## См. также

* Class [String](../../../system/string/)
* Class [License](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
