---
title: RenderFactory
second_title: Aspose.3D لمرجع .NET API
description: ينشئ RenderFactory جميع الموارد التي يتم تمثيلها في خط أنابيب العرض.
type: docs
weight: 2040
url: /ar/net/aspose.threed.render/renderfactory/
---
## RenderFactory class

ينشئ RenderFactory جميع الموارد التي يتم تمثيلها في خط أنابيب العرض.

```csharp
public abstract class RenderFactory
```

## طُرق

| اسم | وصف |
| --- | --- |
| abstract [CreateCubeRenderTexture](../../aspose.threed.render/renderfactory/createcuberendertexture)(RenderParameters, int, int) | إنشاء هدف تصيير يحتوي على نسيج مكعب واحد |
| abstract [CreateDescriptorSet](../../aspose.threed.render/renderfactory/createdescriptorset)(ShaderProgram) | قم بإنشاء مجموعة واصف لبرنامج shader المحدد. |
| abstract [CreateIndexBuffer](../../aspose.threed.render/renderfactory/createindexbuffer)() | إنشاء ملف[`IIndexBuffer`](../iindexbuffer) مثيل لتخزين معلومات وجه المضلع. |
| abstract [CreatePipeline](../../aspose.threed.render/renderfactory/createpipeline)(ShaderProgram, RenderState, VertexDeclaration, DrawOperation) | إنشاء خط أنابيب رسومية مُكوّن مسبقًا باستخدام التظليل المُكوّن مسبقًا / حالة العرض / التصريح الرأسي وعمليات الرسم. |
| abstract [CreateRenderTexture](../../aspose.threed.render/renderfactory/createrendertexture#createrendertexture)(RenderParameters, int, int) | إنشاء هدف عرض يحتوي على 1 هدف يتم عرضه إلى النسيج |
| abstract [CreateRenderTexture](../../aspose.threed.render/renderfactory/createrendertexture#createrendertexture_1)(RenderParameters, int, int, int) | قم بإنشاء هدف تجسيد يتم عرضه على النسيج |
| abstract [CreateRenderWindow](../../aspose.threed.render/renderfactory/createrenderwindow)(RenderParameters, WindowHandle) | قم بإنشاء هدف تصيير يتم عرضه على النافذة الأصلية. |
| abstract [CreateShaderProgram](../../aspose.threed.render/renderfactory/createshaderprogram)(ShaderSource) | إنشاء ملف[`ShaderProgram`](../shaderprogram) كائن |
| [CreateTextureUnit](../../aspose.threed.render/renderfactory/createtextureunit#createtextureunit)() | قم بإنشاء وحدة نسيج ثنائية الأبعاد يمكن الوصول إليها بواسطة shader . |
| abstract [CreateTextureUnit](../../aspose.threed.render/renderfactory/createtextureunit#createtextureunit_1)(TextureType) | قم بإنشاء وحدة نسيج يمكن الوصول إليها بواسطة shader . |
| abstract [CreateUniformBuffer](../../aspose.threed.render/renderfactory/createuniformbuffer)(int) | إنشاء مخزن مؤقت موحد جديد في جانب وحدة معالجة الرسومات بحجم مخصص مسبقًا. |
| abstract [CreateVertexBuffer](../../aspose.threed.render/renderfactory/createvertexbuffer)(VertexDeclaration) | إنشاء ملف[`IVertexBuffer`](../ivertexbuffer) مثيل لتخزين معلومات قمة المضلع. |

### أنظر أيضا

* مساحة الاسم [Aspose.ThreeD.Render](../../aspose.threed.render)
* المجسم [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
