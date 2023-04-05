---
title: License.SetLicense
second_title: Справочник по Aspose.Page для .NET API
description: License метод. Лицензирует компонент.
type: docs
weight: 30
url: /ru/net/aspose.page/license/setlicense/
---
## SetLicense(string) {#setlicense_1}

Лицензирует компонент.

```csharp
public void SetLicense(string licenseName)
```

### Примечания

Пытается найти лицензию в следующих местах:

1. Явный путь.

2. Папка сборки компонента.

3. Папка вызывающей сборки клиента.

4. Папка входной сборки.

5. Встроенный ресурс в вызывающей сборке клиента.

**Примечание:**В .NET Compact Framework пытается найти лицензию только в следующих местах:

1. Явный путь.

2. Встроенный ресурс в вызывающей сборке клиента.

2. Папка файла jar компонента.

### Примеры

В этом примере будет предпринята попытка найти файл лицензии с именем MyLicense.lic в папке, содержащей  компонент в папке, содержащей вызывающую сборку, в папке входной сборки, а затем во встроенных ресурсах вызывающей сборки.

```csharp
[C#]

License license = new License();
license.SetLicense("MyLicense.lic");


[Visual Basic]

Dim license As License = New License
license.SetLicense("MyLicense.lic")
```

файл jar компонента:

```csharp
License license = new License();
license.setLicense("MyLicense.lic");
```

Может быть полным или коротким именем файла или имя встроенного ресурса. Используйте пустую строку для переключения в режим оценки.

### Смотрите также

* class [License](../)
* пространство имен [Aspose.Page](../../license/)
* сборка [Aspose.Page](../../../)

---

## SetLicense(Stream) {#setlicense}

Лицензирует компонент.

```csharp
public void SetLicense(Stream stream)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| stream | Stream | Поток, содержащий лицензию. |

### Примечания

Используйте этот метод для загрузки лицензии из потока.

### Примеры

```csharp
[C#]

License license = new License();
license.SetLicense(myStream);


[Visual Basic]

Dim license as License = new License
license.SetLicense(myStream)

License license = new License();
license.setLicense(myStream);
```

### Смотрите также

* class [License](../)
* пространство имен [Aspose.Page](../../license/)
* сборка [Aspose.Page](../../../)


