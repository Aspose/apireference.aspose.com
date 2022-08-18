---
title: Scene
second_title: Справочник по Aspose.3D для .NET API
description: Сцена  это объект верхнего уровня который содержит узлы геометрию материалы текстуры анимацию позы подсцены и т. д. Сцена может иметь подсцены действует как поддержка нескольких документов в таких файлах как collada/blender /fbx Доступ к иерархии узлов можно получить черезRootNode./scene/rootnodeLibrary./scene/library используется для хранения ссылки на неприсоединенные объекты во время сериализации например метаданные или пользовательские объекты поэтому его можно использовать в качестве библиотеки.
type: docs
weight: 2250
url: /ru/net/aspose.threed/scene/
---
## Scene class

Сцена — это объект верхнего уровня, который содержит узлы, геометрию, материалы, текстуры, анимацию, позы, подсцены и т. д. Сцена может иметь подсцены, действует как поддержка нескольких документов в таких файлах, как collada/blender /fbx Доступ к иерархии узлов можно получить через[`RootNode`](./rootnode)[`Library`](./library) используется для хранения ссылки на неприсоединенные объекты во время сериализации (например, метаданные или пользовательские объекты), поэтому его можно использовать в качестве библиотеки.

```csharp
public class Scene : SceneObject
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [Scene](scene#constructor)() | Инициализирует новый экземпляр[`Scene`](../scene) класс. |
| [Scene](scene#constructor_1)(Entity) | Инициализирует новый экземпляр[`Scene`](../scene) класс с сущностью, прикрепленной к новому узлу. |
| [Scene](scene#constructor_2)(Scene, string) | Инициализирует новый экземпляр[`Scene`](../scene)класс как подсцена. |

## Характеристики

| Имя | Описание |
| --- | --- |
| [AnimationClips](../../aspose.threed/scene/animationclips) { get; } | получает все[`AnimationClip`](../../aspose.threed.animation/animationclip) определяется в сцене. |
| [AssetInfo](../../aspose.threed/scene/assetinfo) { get; set; } | Получает или задает информацию об активе верхнего уровня |
| [CurrentAnimationClip](../../aspose.threed/scene/currentanimationclip) { get; set; } | Получает или задает активный[`AnimationClip`](../../aspose.threed.animation/animationclip) |
| [Library](../../aspose.threed/scene/library) { get; } | Объекты, которые не используются напрямую в иерархии сцен, могут быть определены в библиотеке. Это полезно, когда вы используете подсцены и помещаете повторно используемые компоненты в подсцены. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Получает или задает имя. |
| [Poses](../../aspose.threed/scene/poses) { get; } | получает все[`Pose`](../pose) используется в этой сцене. |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Получает коллекцию всех свойств. |
| [RootNode](../../aspose.threed/scene/rootnode) { get; } | Получает корневой узел сцены. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Получает сцену, которой принадлежит этот объект |
| [SubScenes](../../aspose.threed/scene/subscenes) { get; } | Получает все подсцены |

## Методы

| Имя | Описание |
| --- | --- |
| static [FromFile](../../aspose.threed/scene/fromfile#fromfile)(string) | Открывает сцену по указанному пути |
| static [FromFile](../../aspose.threed/scene/fromfile#fromfile_3)(string, CancellationToken) | Открывает сцену по указанному пути |
| static [FromFile](../../aspose.threed/scene/fromfile#fromfile_1)(string, FileFormat, CancellationToken) | Открывает сцену по указанному пути, используя указанный формат файла. |
| static [FromFile](../../aspose.threed/scene/fromfile#fromfile_2)(string, LoadOptions, CancellationToken) | Открывает сцену по указанному пути, используя указанный формат файла. |
| static [FromStream](../../aspose.threed/scene/fromstream#fromstream_2)(Stream, CancellationToken) | Открывает сцену из заданного потока |
| static [FromStream](../../aspose.threed/scene/fromstream#fromstream)(Stream, FileFormat, CancellationToken) | Открывает сцену из данного потока, используя указанный формат файла. |
| static [FromStream](../../aspose.threed/scene/fromstream#fromstream_1)(Stream, LoadOptions, CancellationToken) | Открывает сцену из данного потока, используя указанную конфигурацию ввода-вывода. |
| [Clear](../../aspose.threed/scene/clear)() | Очищает содержимое сцены и восстанавливает настройки по умолчанию. |
| [CreateAnimationClip](../../aspose.threed/scene/createanimationclip)(string) | Сокращенная функция для создания и регистрации[`AnimationClip`](../../aspose.threed.animation/animationclip) Первый[`AnimationClip`](../../aspose.threed.animation/animationclip) будет назначен на[`CurrentAnimationClip`](./currentanimationclip) |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Находит свойство. Это может быть динамическое свойство (созданное CreateDynamicProperty/SetProperty) или родное свойство (идентифицированное по имени) |
| [GetAnimationClip](../../aspose.threed/scene/getanimationclip)(string) | Получает именованный[`AnimationClip`](../../aspose.threed.animation/animationclip) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Получить значение указанного свойства |
| [Open](../../aspose.threed/scene/open#open)(Stream) | Открывает сцену из заданного потока |
| [Open](../../aspose.threed/scene/open#open_4)(string) | Открывает сцену по указанному пути |
| [Open](../../aspose.threed/scene/open#open_3)(Stream, CancellationToken) | Открывает сцену из заданного потока |
| [Open](../../aspose.threed/scene/open#open_8)(string, CancellationToken) | Открывает сцену по указанному пути |
| [Open](../../aspose.threed/scene/open#open_6)(string, LoadOptions) | Открывает сцену по указанному пути, используя указанный формат файла. |
| [Open](../../aspose.threed/scene/open#open_1)(Stream, FileFormat, CancellationToken) | Открывает сцену из данного потока, используя указанный формат файла. |
| [Open](../../aspose.threed/scene/open#open_2)(Stream, LoadOptions, CancellationToken) | Открывает сцену из данного потока, используя указанную конфигурацию ввода-вывода. |
| [Open](../../aspose.threed/scene/open#open_5)(string, FileFormat, CancellationToken) | Открывает сцену по указанному пути, используя указанный формат файла. |
| [Open](../../aspose.threed/scene/open#open_7)(string, LoadOptions, CancellationToken) | Открывает сцену по указанному пути, используя указанный формат файла. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Удаляет динамическое свойство. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Удалить указанное свойство с именем name |
| [Render](../../aspose.threed/scene/render#render)(Camera, Bitmap) | Визуализация сцены в растровое изображение с точки зрения данной камеры. |
| [Render](../../aspose.threed/scene/render#render_2)(Camera, string) | Рендеринг сцены во внешний файл с точки зрения данной камеры. Размер вывода по умолчанию — 1024x768, а формат вывода — png |
| [Render](../../aspose.threed/scene/render#render_1)(Camera, Bitmap, ImageRenderOptions) | Визуализация сцены в растровое изображение с точки зрения данной камеры. |
| [Render](../../aspose.threed/scene/render#render_3)(Camera, string, Size, ImageFormat) | Рендеринг сцены во внешний файл с точки зрения данной камеры. |
| [Render](../../aspose.threed/scene/render#render_4)(Camera, string, Size, ImageFormat, ImageRenderOptions) | Рендеринг сцены во внешний файл с точки зрения данной камеры. |
| [Save](../../aspose.threed/scene/save#save_4)(string) | Сохраняет сцену по указанному пути, используя указанный формат файла. |
| [Save](../../aspose.threed/scene/save#save)(Stream, FileFormat) | Сохраняет сцену в поток, используя указанный формат файла. |
| [Save](../../aspose.threed/scene/save#save_2)(Stream, SaveOptions) | Сохраняет сцену в поток, используя указанный формат файла. |
| [Save](../../aspose.threed/scene/save#save_5)(string, FileFormat) | Сохраняет сцену по указанному пути, используя указанный формат файла. |
| [Save](../../aspose.threed/scene/save#save_7)(string, SaveOptions) | Сохраняет сцену по указанному пути, используя указанный формат файла. |
| [Save](../../aspose.threed/scene/save#save_1)(Stream, FileFormat, CancellationToken) | Сохраняет сцену в поток, используя указанный формат файла. |
| [Save](../../aspose.threed/scene/save#save_3)(Stream, SaveOptions, CancellationToken) | Сохраняет сцену в поток, используя указанный формат файла. |
| [Save](../../aspose.threed/scene/save#save_6)(string, FileFormat, CancellationToken) | Сохраняет сцену по указанному пути, используя указанный формат файла. |
| [Save](../../aspose.threed/scene/save#save_8)(string, SaveOptions, CancellationToken) | Сохраняет сцену по указанному пути, используя указанный формат файла. |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Устанавливает значение указанного свойства |

### Смотрите также

* class [SceneObject](../sceneobject)
* пространство имен [Aspose.ThreeD](../../aspose.threed)
* сборка [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
