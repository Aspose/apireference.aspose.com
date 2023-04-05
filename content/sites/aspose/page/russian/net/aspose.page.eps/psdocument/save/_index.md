---
title: PsDocument.Save
second_title: Справочник по Aspose.Page для .NET API
description: PsDocument метод. Сохраняет файл PS/EPS на устройство.
type: docs
weight: 200
url: /ru/net/aspose.page.eps/psdocument/save/
---
## Save(Device, SaveOptions) {#save_1}

Сохраняет файл PS/EPS на устройство.

```csharp
public override void Save(Device device, SaveOptions options)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| device | Device | Выходное устройство. |
| options | SaveOptions | Содержит флаги, определяющие вывод ошибок, возникших во время преобразования. |

### Смотрите также

* class [Device](../../../aspose.page/device/)
* class [SaveOptions](../../../aspose.page/saveoptions/)
* class [PsDocument](../)
* пространство имен [Aspose.Page.EPS](../../psdocument/)
* сборка [Aspose.Page](../../../)

---

## Save(Stream) {#save_2}

сохранено[`PsDocument`](../) как EPS-файл. Этот метод используется только после обновления метаданных XMP. Он сохраняет исходный файл EPS с обновленными существующими метаданными или новым, созданным при вызове метода GetMetadata. В последнем случае добавляется весь необходимый код PostScript и комментарии EPS.

```csharp
public void Save(Stream epsStream)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| epsStream | Stream | Поток выходного файла EPS. |

### Смотрите также

* class [PsDocument](../)
* пространство имен [Aspose.Page.EPS](../../psdocument/)
* сборка [Aspose.Page](../../../)

---

## Save() {#save}

сохранено[`PsDocument`](../) как EPS-файл. Этот метод используется только в том случае, если PsDocument был создан с нуля.

```csharp
public void Save()
```

### Смотрите также

* class [PsDocument](../)
* пространство имен [Aspose.Page.EPS](../../psdocument/)
* сборка [Aspose.Page](../../../)


