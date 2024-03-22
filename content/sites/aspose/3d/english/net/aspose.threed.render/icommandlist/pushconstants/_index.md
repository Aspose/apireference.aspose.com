---
title: ICommandList.PushConstants
second_title: Aspose.3D for .NET API Reference
description: ICommandList method. Push the constant to the pipeline
type: docs
weight: 70
url: /net/aspose.threed.render/icommandlist/pushconstants/
---
## PushConstants(ShaderStage, byte[]) {#pushconstants}

Push the constant to the pipeline

```csharp
public void PushConstants(ShaderStage stage, byte[] data)
```

| Parameter | Type | Description |
| --- | --- | --- |
| stage | ShaderStage | Which shader stage will consume the constant data |
| data | Byte[] | The data that will be sent to the shader |

### See Also

* enum [ShaderStage](../../shaderstage/)
* interface [ICommandList](../)
* namespace [Aspose.ThreeD.Render](../../../aspose.threed.render/)
* assembly [Aspose.3D](../../../)

---

## PushConstants(ShaderStage, byte[], int) {#pushconstants_1}

Push the constant to the pipeline

```csharp
public void PushConstants(ShaderStage stage, byte[] data, int size)
```

| Parameter | Type | Description |
| --- | --- | --- |
| stage | ShaderStage | Which shader stage will consume the constant data |
| data | Byte[] | The data that will be sent to the shader |
| size | Int32 | Bytes to write to the pipeline |

### See Also

* enum [ShaderStage](../../shaderstage/)
* interface [ICommandList](../)
* namespace [Aspose.ThreeD.Render](../../../aspose.threed.render/)
* assembly [Aspose.3D](../../../)


