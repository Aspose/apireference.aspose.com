---
title: RenderFactory.CreatePipeline
second_title: Aspose.3D for .NET API Reference
description: RenderFactory method. Create a preconfigured graphics pipeline with preconfigured shader/render state/vertex declaration and draw operations
type: docs
weight: 40
url: /net/aspose.threed.render/renderfactory/createpipeline/
---
## RenderFactory.CreatePipeline method

Create a preconfigured graphics pipeline with preconfigured shader/render state/vertex declaration and draw operations.

```csharp
public abstract IPipeline CreatePipeline(ShaderProgram shader, RenderState renderState, 
    VertexDeclaration vertexDeclaration, DrawOperation drawOperation)
```

| Parameter | Type | Description |
| --- | --- | --- |
| shader | ShaderProgram | The shader used in the rendering |
| renderState | RenderState | The render state used in the rendering |
| vertexDeclaration | VertexDeclaration | The vertex declaration of input vertex data |
| drawOperation | DrawOperation | Draw operation |

### Return Value

A new pipeline instance

### See Also

* interface [IPipeline](../../ipipeline/)
* class [ShaderProgram](../../shaderprogram/)
* class [RenderState](../../renderstate/)
* class [VertexDeclaration](../../../aspose.threed.utilities/vertexdeclaration/)
* enum [DrawOperation](../../drawoperation/)
* class [RenderFactory](../)
* namespace [Aspose.ThreeD.Render](../../../aspose.threed.render/)
* assembly [Aspose.3D](../../../)


