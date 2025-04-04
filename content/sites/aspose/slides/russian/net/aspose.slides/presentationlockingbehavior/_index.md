---
title: PresentationLockingBehavior
second_title: Справочник по API Aspose.Slides для .NET
description: Представляет поведение в отношении обработкиIPresentation./ipresentationисточника файла или Stream при загрузке и работе с экземпляромIPresentation./ipresentation.  Источник  это параметр передаваемый конструкторуIPresentation./ipresentation. В приведенном ниже примере источником является файл pres.pptx
type: docs
weight: 8910
url: /ru/net/aspose.slides/presentationlockingbehavior/
---
## PresentationLockingBehavior enumeration

Представляет поведение в отношении обработки[`IPresentation`](../ipresentation)источника (файла или Stream) при загрузке и работе с экземпляром[`IPresentation`](../ipresentation).  Источник — это параметр, передаваемый конструктору[`IPresentation`](../ipresentation). В приведенном ниже примере источником является файл "pres.pptx": 
 
```csharp
LoadOptions loadOptions = new LoadOptions { 
  BlobManagementOptions = { PresentationLockingBehavior = PresentationLockingBehavior.KeepLocked } };
using (IPresentation pres = new Presentation("pres.pptx", loadOptions)) { }
``` 

В этом примере источник (файл "pres.pptx") будет заблокирован на время жизни экземпляра[`IPresentation`](../ipresentation) , т.е. быть изменены или удалены другим процессом.

```csharp
public enum PresentationLockingBehavior
```

### Ценности

| Имя | Ценность | Описание |
| --- | --- | --- |
| LoadAndRelease | `0` | Источник будет заблокирован только на время выполнения[`IPresentation`](../ipresentation)конструктора.  Если для[`IsTemporaryFilesAllowed`](../iblobmanagementoptions/istemporaryfilesallowed)установлено значение false, все BLOB будут загружены в память. В противном случае могут использоваться другие средства, такие как временные файлы. Это поведение медленнее, чемKeepLocked, и если возможно передать владение источником[`IPresentation`](../ipresentation)рекомендуется использоватьKeepLocked. |
| KeepLocked | `1` | Исходный код будет заблокирован на все время существования[`IPresentation`](../ipresentation)instance, пока не будет утилизировать. [`IsTemporaryFilesAllowed`](../iblobmanagementoptions/istemporaryfilesallowed)должно быть установлено значение true для использования этого поведения, иначе будет выброшено исключение. Это поведение рекомендуется, оно быстрее и потребляет меньше памяти, чемLoadAndRelease. |
| LoadAndRelease_Legacy_TemporaryDefault | `255` | Источник будет заблокирован только на время[`IPresentation`](../ipresentation)выполнение конструктора, все BLOB будет загружен в память. Это устаревшее поведение для обеспечения обратной совместимости. Такого же поведения можно добиться с помощьюLoadAndReleaseи установить[`IsTemporaryFilesAllowed`](../iblobmanagementoptions/istemporaryfilesallowed) в ложь. Пожалуйста, рассмотрите возможность выбора поведенияLoadAndReleaseилиKeepLocked, что самый подходящий для вас. ПослеLoadAndRelease_Legacy_TemporaryDefaultбудет удален,KeepLocked будет поведением по умолчанию. |

### Смотрите также

* пространство имен [Aspose.Slides](../../aspose.slides)
* сборка [Aspose.Slides](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
