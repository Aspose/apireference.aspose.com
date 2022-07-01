---
title: Aspose.ThreeD.Render
second_title: Справочник по Aspose.3D для .NET API
description: Все классы связанные с рендерингом определены в этом пространстве имен
type: docs
weight: 70
url: /ru/net/aspose.threed.render/
---
Все классы, связанные с рендерингом, определены в этом пространстве имен

## Классы

| Учебный класс | Описание |
| --- | --- |
| [DescriptorSetUpdater](./descriptorsetupdater) | Этот класс позволяет обновлять[`IDescriptorSet`](../aspose.threed.render/idescriptorset)в цепочке операций. |
| [DriverException](./driverexception) | Исключение, вызванное внутренними драйверами рендеринга. |
| [EntityRenderer](./entityrenderer) | Подкласс этого класса для реализации рендеринга различных типов сущностей. |
| [EntityRendererKey](./entityrendererkey) | Ключ рендерера зарегистрированных объектов |
| [GLSLSource](./glslsource) | Исходный код шейдеров на GLSL |
| [InitializationException](./initializationexception) | Исключения при инициализации конвейера рендеринга |
| [PostProcessing](./postprocessing) | Эффекты постобработки |
| [PushConstant](./pushconstant) | Утилита для предоставления данных шейдеру через push-константу. |
| [Renderer](./renderer) | Контекст об рендерере. |
| [RendererVariableManager](./renderervariablemanager) | Этот класс управляет переменными, используемыми при рендеринге |
| [RenderFactory](./renderfactory) | RenderFactory создает все ресурсы, представленные в конвейере рендеринга. |
| [RenderParameters](./renderparameters) | Описать параметры render target |
| [RenderResource](./renderresource) | Абстрактный класс всех ресурсов рендеринга Все ресурсы рендеринга будут удалены при освобождении рендерера. Классы типа[`Mesh`](../aspose.threed.entities/mesh)/[`Texture`](../aspose.threed.shading/texture)будут иметь соответствующий RenderResource |
| [RenderState](./renderstate) | Состояние рендеринга для построения конвейера Изменения, внесенные в состояние рендеринга, не повлияют на созданные экземпляры конвейера. |
| [ShaderException](./shaderexception) | Исключения, связанные с шейдерами |
| [ShaderProgram](./shaderprogram) | Шейдерная программа |
| [ShaderSet](./shaderset) | Шейдерные программы для каждого вида материалов |
| [ShaderSource](./shadersource) | Исходный код шейдера |
| [ShaderVariable](./shadervariable) | Переменная шейдера |
| [SPIRVSource](./spirvsource) | Скомпилированный шейдер в формате SPIR-V. |
| [StencilState](./stencilstate) | Состояния трафарета для каждой грани. |
| [TextureData](./texturedata) | Этот класс содержит необработанные данные и определение формата текстуры. |
| [Viewport](./viewport) | A[`IRenderTarget`](../aspose.threed.render/irendertarget)содержит как минимум один вьюпорт для рендеринга сцены. |
| [WindowHandle](./windowhandle) | Инкапсулированный дескриптор окна для разных платформ. |
## Интерфейсы

| Интерфейс | Описание |
| --- | --- |
| [IBuffer](./ibuffer) | Базовый интерфейс всех управляемых буферов, используемых при рендеринге |
| [ICommandList](./icommandlist) | Кодирует последовательность команд, которые будут отправлены на GPU для рендеринга. |
| [IDescriptorSet](./idescriptorset) | Наборы дескрипторов описывают различные ресурсы, которые можно использовать для привязки к конвейеру рендеринга, такие как буферы, текстуры |
| [IIndexBuffer](./iindexbuffer) | Индексный буфер описывает геометрию, используемую в конвейере рендеринга. |
| [IPipeline](./ipipeline) | Заранее подготовленная последовательность операций для рисования на стороне графического процессора. |
| [IRenderQueue](./irenderqueue) | Визуализатор объектов использует эту очередь для управления задачами рендеринга. |
| [IRenderTarget](./irendertarget) | Базовый интерфейс цели рендеринга |
| [IRenderTexture](./irendertexture) | Интерфейс текстуры рендера |
| [IRenderWindow](./irenderwindow) | IRenderWindow представляет собственное окно, созданное операционной системой, которая поддерживает рендеринг. |
| [ITexture1D](./itexture1d) | Одномерная текстура |
| [ITexture2D](./itexture2d) | 2D-текстура |
| [ITextureCubemap](./itexturecubemap) | Текстура карты куба |
| [ITextureUnit](./itextureunit) | [`ITextureUnit`](../aspose.threed.render/itextureunit)представляет собой текстуру в памяти, которая совместно используется GPU и CPU и может использоваться шейдером, где[`Texture`](../aspose.threed.shading/texture)представляет собой только ссылку на внешний файл. Более подробную информацию можно найти https://en.wikipedia.org/wiki/Texture_mapping_unit |
| [IVertexBuffer](./ivertexbuffer) | Буфер вершин содержит данные вершин полигонов, которые будут отправлены в конвейер рендеринга |
## перечисление

| перечисление | Описание |
| --- | --- |
| [BlendFactor](./blendfactor) | Коэффициент смешивания задает арифметику пикселей. |
| [CompareFunction](./comparefunction) | Функция сравнения, используемая при тестировании глубины/трафарета. |
| [CubeFace](./cubeface) | Каждая грань текстуры карты куба |
| [CullFaceMode](./cullfacemode) | Какое лицо отбраковывать |
| [DrawOperation](./drawoperation) | Примитивные типы для рендеринга |
| [EntityRendererFeatures](./entityrendererfeatures) | Дополнительные функции, которые предоставляет средство визуализации объектов |
| [FrontFace](./frontface) | Определить передние и задние многоугольники |
| [IndexDataType](./indexdatatype) | Тип данных элементов в[`IIndexBuffer`](../aspose.threed.render/iindexbuffer) |
| [PixelFormat](./pixelformat) | Формат пикселя, используемый в текстурном блоке. |
| [PolygonMode](./polygonmode) | Режим растеризации полигонов |
| [PresetShaders](./presetshaders) | Это определяет предустановленные внутренние шейдеры, используемые визуализатором. |
| [RenderQueueGroupId](./renderqueuegroupid) | Идентификатор группы очереди рендеринга |
| [RenderStage](./renderstage) | Стадия рендеринга |
| [ShaderStage](./shaderstage) | Этап шейдера |
| [StencilAction](./stencilaction) | Тестовые действия трафарета |
| [TextureType](./texturetype) | Тип[`ITextureUnit`](../aspose.threed.render/itextureunit) |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
