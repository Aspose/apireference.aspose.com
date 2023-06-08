---
title: Class Toolkit
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.ToolKit.Toolkit class. 
type: docs
weight: 11260
url: /net/aspose.cad.fileformats.glb.toolkit/toolkit/
---
## Toolkit class

```csharp
public static class Toolkit
```

## Methods

| Name | Description |
| --- | --- |
| static [AddMesh&lt;TMaterial,TvG,TvM,TvS&gt;](../../aspose.cad.fileformats.glb.toolkit/toolkit/addmesh/)(this MeshBuilder&lt;TMaterial, TvG, TvM, TvS&gt;, Mesh, Converter&lt;Material, TMaterial&gt;) |  |
| static [CopyChannelsTo](../../aspose.cad.fileformats.glb.toolkit/toolkit/copychannelsto/#copychannelsto)(this Material, MaterialBuilder, params string[]) |  |
| static [CopyChannelsTo](../../aspose.cad.fileformats.glb.toolkit/toolkit/copychannelsto/#copychannelsto_1)(this MaterialBuilder, Material, params string[]) |  |
| static [CopyTo](../../aspose.cad.fileformats.glb.toolkit/toolkit/copyto/#copyto_2)(this ChannelBuilder, MaterialChannel) |  |
| static [CopyTo](../../aspose.cad.fileformats.glb.toolkit/toolkit/copyto/#copyto)(this Material, MaterialBuilder) |  |
| static [CopyTo](../../aspose.cad.fileformats.glb.toolkit/toolkit/copyto/#copyto_3)(this MaterialBuilder, Material) |  |
| static [CopyTo](../../aspose.cad.fileformats.glb.toolkit/toolkit/copyto/#copyto_1)(this MaterialChannel, ChannelBuilder) |  |
| static [CreateBufferView&lt;T&gt;](../../aspose.cad.fileformats.glb.toolkit/toolkit/createbufferview/)(this GlbData, IReadOnlyList&lt;T&gt;) |  |
| static [CreateMaterial](../../aspose.cad.fileformats.glb.toolkit/toolkit/creatematerial/)(this GlbData, MaterialBuilder) |  |
| static [CreateMesh](../../aspose.cad.fileformats.glb.toolkit/toolkit/createmesh/#createmesh)(this GlbData, IMeshBuilder&lt;MaterialBuilder&gt;) |  |
| static [CreateMesh&lt;TMaterial&gt;](../../aspose.cad.fileformats.glb.toolkit/toolkit/createmesh/#createmesh_1)(this GlbData, Converter&lt;TMaterial, Material&gt;, IMeshBuilder&lt;TMaterial&gt;) |  |
| static [CreateMeshes](../../aspose.cad.fileformats.glb.toolkit/toolkit/createmeshes/#createmeshes)(this GlbData, params IMeshBuilder&lt;MaterialBuilder&gt;[]) |  |
| static [CreateMeshes&lt;TMaterial&gt;](../../aspose.cad.fileformats.glb.toolkit/toolkit/createmeshes/#createmeshes_1)(this GlbData, Converter&lt;TMaterial, Material&gt;, params IMeshBuilder&lt;TMaterial&gt;[]) |  |
| static [CreateMeshes&lt;TMaterial&gt;](../../aspose.cad.fileformats.glb.toolkit/toolkit/createmeshes/#createmeshes_2)(this GlbData, Converter&lt;TMaterial, Material&gt;, SceneBuilderSchema2Settings, params IMeshBuilder&lt;TMaterial&gt;[]) |  |
| static [CreateVertexAccessor](../../aspose.cad.fileformats.glb.toolkit/toolkit/createvertexaccessor/)(this GlbData, MemoryAccessor) |  |
| static [EvaluateLines](../../aspose.cad.fileformats.glb.toolkit/toolkit/evaluatelines/#evaluatelines)(this Mesh, IGeometryTransform) |  |
| static [EvaluateLines](../../aspose.cad.fileformats.glb.toolkit/toolkit/evaluatelines/#evaluatelines_1)(this MeshPrimitive, IGeometryTransform) |  |
| static [EvaluatePoints](../../aspose.cad.fileformats.glb.toolkit/toolkit/evaluatepoints/#evaluatepoints)(this Mesh, IGeometryTransform) |  |
| static [EvaluatePoints](../../aspose.cad.fileformats.glb.toolkit/toolkit/evaluatepoints/#evaluatepoints_1)(this MeshPrimitive, IGeometryTransform) |  |
| static [EvaluateTriangles](../../aspose.cad.fileformats.glb.toolkit/toolkit/evaluatetriangles/#evaluatetriangles_2)(this Mesh, IGeometryTransform) |  |
| static [EvaluateTriangles](../../aspose.cad.fileformats.glb.toolkit/toolkit/evaluatetriangles/#evaluatetriangles_3)(this MeshPrimitive, IGeometryTransform) |  |
| static [EvaluateTriangles](../../aspose.cad.fileformats.glb.toolkit/toolkit/evaluatetriangles/#evaluatetriangles_4)(this Scene, RuntimeOptions, Animation, float) | Yields a collection of triangles representing the geometry in world space. |
| static [EvaluateTriangles&lt;TvG,TvM&gt;](../../aspose.cad.fileformats.glb.toolkit/toolkit/evaluatetriangles/#evaluatetriangles)(this Scene, RuntimeOptions, Animation, float) | Yields a collection of triangles representing the geometry in world space. |
| static [EvaluateTriangles&lt;TvG,TvM,TvS&gt;](../../aspose.cad.fileformats.glb.toolkit/toolkit/evaluatetriangles/#evaluatetriangles_1)(this Mesh, IGeometryTransform) |  |
| static [FindNode](../../aspose.cad.fileformats.glb.toolkit/toolkit/findnode/#findnode)(this Node, Predicate&lt;Node&gt;) | Finds a [`Node`](../../aspose.cad.fileformats.glb/node/) by name in the current graph. |
| static [FindNode](../../aspose.cad.fileformats.glb.toolkit/toolkit/findnode/#findnode_1)(this Scene, Predicate&lt;Node&gt;) | Finds a [`Node`](../../aspose.cad.fileformats.glb/node/) by name in the current graph. |
| static [GetDiffuseColor](../../aspose.cad.fileformats.glb.toolkit/toolkit/getdiffusecolor/)(this Material, Vector4) |  |
| static [GetDiffuseTexture](../../aspose.cad.fileformats.glb.toolkit/toolkit/getdiffusetexture/)(this Material) |  |
| static [GetDiffuseTextureTransform](../../aspose.cad.fileformats.glb.toolkit/toolkit/getdiffusetexturetransform/)(this Material) |  |
| static [GetVertexColumns](../../aspose.cad.fileformats.glb.toolkit/toolkit/getvertexcolumns/)(this MeshPrimitive) |  |
| static [SaveAsWavefront](../../aspose.cad.fileformats.glb.toolkit/toolkit/saveaswavefront/#saveaswavefront)(this GlbData, string) |  |
| static [SaveAsWavefront](../../aspose.cad.fileformats.glb.toolkit/toolkit/saveaswavefront/#saveaswavefront_1)(this GlbData, string, Animation, float) |  |
| static [ToMaterialBuilder](../../aspose.cad.fileformats.glb.toolkit/toolkit/tomaterialbuilder/)(this Material) |  |
| static [ToMeshBuilder](../../aspose.cad.fileformats.glb.toolkit/toolkit/tomeshbuilder/#tomeshbuilder)(this Mesh) |  |
| static [ToMeshBuilder&lt;TvG,TvM,TvS&gt;](../../aspose.cad.fileformats.glb.toolkit/toolkit/tomeshbuilder/#tomeshbuilder_2)(this IEnumerable&lt;EvaluatedTriangle&lt;TvG, TvM, TvS&gt;&gt;) |  |
| static [ToMeshBuilder&lt;TMaterial,TvG,TvM,TvS&gt;](../../aspose.cad.fileformats.glb.toolkit/toolkit/tomeshbuilder/#tomeshbuilder_1)(this IEnumerable&lt;(VertexBuilder&lt;TvG, TvM, TvS&gt; A, VertexBuilder&lt;TvG, TvM, TvS&gt; B, VertexBuilder&lt;TvG, TvM, TvS&gt; C, TMaterial Material)&gt;, Converter&lt;TMaterial, MaterialBuilder&gt;) |  |
| static [ToSceneBuilder](../../aspose.cad.fileformats.glb.toolkit/toolkit/toscenebuilder/)(this Scene) |  |
| static [ToSchema2](../../aspose.cad.fileformats.glb.toolkit/toolkit/toschema2/)(this AlphaMode) |  |
| static [ToStaticMeshBuilder&lt;TvG,TvM&gt;](../../aspose.cad.fileformats.glb.toolkit/toolkit/tostaticmeshbuilder/#tostaticmeshbuilder)(this Scene, RuntimeOptions, Animation, float) |  |
| static [ToStaticMeshBuilder&lt;TMaterial,TvG,TvM&gt;](../../aspose.cad.fileformats.glb.toolkit/toolkit/tostaticmeshbuilder/#tostaticmeshbuilder_1)(this Scene, Converter&lt;Material, TMaterial&gt;, RuntimeOptions, Animation, float) | Evaluates the current *srcScene* at a given *animation* and *time* and creates a static [`MeshBuilder`](../../aspose.cad.fileformats.glb.geometry/meshbuilder-4/) |
| static [ToToolkit](../../aspose.cad.fileformats.glb.toolkit/toolkit/totoolkit/)(this AlphaMode) |  |
| static [UseAnimation](../../aspose.cad.fileformats.glb.toolkit/toolkit/useanimation/)(this GlbData, string) |  |
| static [UseImageWithContent](../../aspose.cad.fileformats.glb.toolkit/toolkit/useimagewithcontent/)(this GlbData, MemoryImage) | Creates or reuses an [`GlbImage`](../../aspose.cad.fileformats.glb/glbimage/) with the image content set by *image* |
| static [UseImageWithFile](../../aspose.cad.fileformats.glb.toolkit/toolkit/useimagewithfile/)(this GlbData, string) | Creates or reuses an [`GlbImage`](../../aspose.cad.fileformats.glb/glbimage/) with the file set by *filePath* |
| static [WithChannelColor](../../aspose.cad.fileformats.glb.toolkit/toolkit/withchannelcolor/)(this Material, string, Vector4) |  |
| static [WithChannelFactor](../../aspose.cad.fileformats.glb.toolkit/toolkit/withchannelfactor/)(this Material, string, string, float) |  |
| static [WithChannelParameter](../../aspose.cad.fileformats.glb.toolkit/toolkit/withchannelparameter/)(this Material, string, Vector4) |  |
| static [WithChannelTexture](../../aspose.cad.fileformats.glb.toolkit/toolkit/withchanneltexture/#withchanneltexture)(this Material, string, int, ImageGlb) |  |
| static [WithChannelTexture](../../aspose.cad.fileformats.glb.toolkit/toolkit/withchanneltexture/#withchanneltexture_1)(this Material, string, int, string) |  |
| static [WithColor](../../aspose.cad.fileformats.glb.toolkit/toolkit/withcolor/)(this PunctualLight, Vector3, float, float) | Defines the light color, intensity and range for the current [`PunctualLight`](../../aspose.cad.fileformats.glb/punctuallight/). |
| static [WithDefault](../../aspose.cad.fileformats.glb.toolkit/toolkit/withdefault/#withdefault)(this Material) | Initializes this [`Material`](../../aspose.cad.fileformats.glb/material/) instance with default material attributes. |
| static [WithDefault](../../aspose.cad.fileformats.glb.toolkit/toolkit/withdefault/#withdefault_1)(this Material, Vector4) | Initializes this [`Material`](../../aspose.cad.fileformats.glb/material/) instance with default material attributes. |
| static [WithDoubleSide](../../aspose.cad.fileformats.glb.toolkit/toolkit/withdoubleside/)(this Material, bool) |  |
| static [WithIndicesAccessor](../../aspose.cad.fileformats.glb.toolkit/toolkit/withindicesaccessor/#withindicesaccessor_1)(this MeshPrimitive, PrimitiveType, IReadOnlyList&lt;int&gt;) |  |
| static [WithIndicesAccessor](../../aspose.cad.fileformats.glb.toolkit/toolkit/withindicesaccessor/#withindicesaccessor)(this MeshPrimitive, PrimitiveType, MemoryAccessor) |  |
| static [WithIndicesAutomatic](../../aspose.cad.fileformats.glb.toolkit/toolkit/withindicesautomatic/)(this MeshPrimitive, PrimitiveType) |  |
| static [WithInstanceAccessor&lt;T&gt;](../../aspose.cad.fileformats.glb.toolkit/toolkit/withinstanceaccessor/)(this MeshGpuInstancing, string, IReadOnlyList&lt;T&gt;) |  |
| static [WithInstanceAccessors](../../aspose.cad.fileformats.glb.toolkit/toolkit/withinstanceaccessors/)(this MeshGpuInstancing, IReadOnlyList&lt;AffineTransform&gt;) |  |
| static [WithInstanceCustomAccessor](../../aspose.cad.fileformats.glb.toolkit/toolkit/withinstancecustomaccessor/)(this MeshGpuInstancing, string, IReadOnlyList&lt;object&gt;) |  |
| static [WithInstanceCustomAccessors](../../aspose.cad.fileformats.glb.toolkit/toolkit/withinstancecustomaccessors/)(this MeshGpuInstancing, IReadOnlyList&lt;JsonContent&gt;) |  |
| static [WithLocalRotation](../../aspose.cad.fileformats.glb.toolkit/toolkit/withlocalrotation/)(this Node, Quaternion) |  |
| static [WithLocalScale](../../aspose.cad.fileformats.glb.toolkit/toolkit/withlocalscale/)(this Node, Vector3) |  |
| static [WithLocalTransform](../../aspose.cad.fileformats.glb.toolkit/toolkit/withlocaltransform/)(this Node, AffineTransform) |  |
| static [WithLocalTranslation](../../aspose.cad.fileformats.glb.toolkit/toolkit/withlocaltranslation/)(this Node, Vector3) |  |
| static [WithMaterial](../../aspose.cad.fileformats.glb.toolkit/toolkit/withmaterial/)(this MeshPrimitive, Material) |  |
| static [WithMesh](../../aspose.cad.fileformats.glb.toolkit/toolkit/withmesh/)(this Node, Mesh) |  |
| static [WithMorphingAnimation](../../aspose.cad.fileformats.glb.toolkit/toolkit/withmorphinganimation/#withmorphinganimation)(this Node, string, ICurveSampler&lt;SparseWeight8&gt;) |  |
| static [WithMorphingAnimation&lt;T&gt;](../../aspose.cad.fileformats.glb.toolkit/toolkit/withmorphinganimation/#withmorphinganimation_1)(this Node, string, ICurveSampler&lt;T&gt;) |  |
| static [WithMorphTargetAccessors](../../aspose.cad.fileformats.glb.toolkit/toolkit/withmorphtargetaccessors/)(this MeshPrimitive, int, IEnumerable&lt;MemoryAccessor&gt;) |  |
| static [WithOrthographicCamera](../../aspose.cad.fileformats.glb.toolkit/toolkit/withorthographiccamera/)(this Node, float, float, float, float) |  |
| static [WithPBRMetallicRoughness](../../aspose.cad.fileformats.glb.toolkit/toolkit/withpbrmetallicroughness/#withpbrmetallicroughness)(this Material) | Initializes this [`Material`](../../aspose.cad.fileformats.glb/material/) instance with PBR Metallic Roughness attributes. |
| static [WithPBRMetallicRoughness](../../aspose.cad.fileformats.glb.toolkit/toolkit/withpbrmetallicroughness/#withpbrmetallicroughness_1)(this Material, Vector4, string, string, float, float) |  |
| static [WithPBRSpecularGlossiness](../../aspose.cad.fileformats.glb.toolkit/toolkit/withpbrspecularglossiness/)(this Material) | Initializes this [`Material`](../../aspose.cad.fileformats.glb/material/) instance with PBR Specular Glossiness attributes. |
| static [WithPerspectiveCamera](../../aspose.cad.fileformats.glb.toolkit/toolkit/withperspectivecamera/)(this Node, float?, float, float, float) |  |
| static [WithRotationAnimation](../../aspose.cad.fileformats.glb.toolkit/toolkit/withrotationanimation/#withrotationanimation_2)(this Node, string, params (float Key, Quaternion Value)[]) |  |
| static [WithRotationAnimation](../../aspose.cad.fileformats.glb.toolkit/toolkit/withrotationanimation/#withrotationanimation)(this Node, string, ICurveSampler&lt;Quaternion&gt;) |  |
| static [WithRotationAnimation](../../aspose.cad.fileformats.glb.toolkit/toolkit/withrotationanimation/#withrotationanimation_1)(this Node, string, IReadOnlyDictionary&lt;float, Quaternion&gt;) |  |
| static [WithScaleAnimation](../../aspose.cad.fileformats.glb.toolkit/toolkit/withscaleanimation/#withscaleanimation_2)(this Node, string, params (float Key, Vector3 Value)[]) |  |
| static [WithScaleAnimation](../../aspose.cad.fileformats.glb.toolkit/toolkit/withscaleanimation/#withscaleanimation)(this Node, string, ICurveSampler&lt;Vector3&gt;) |  |
| static [WithScaleAnimation](../../aspose.cad.fileformats.glb.toolkit/toolkit/withscaleanimation/#withscaleanimation_1)(this Node, string, IReadOnlyDictionary&lt;float, Vector3&gt;) |  |
| static [WithSkin](../../aspose.cad.fileformats.glb.toolkit/toolkit/withskin/)(this Node, Skin) |  |
| static [WithSkinBinding](../../aspose.cad.fileformats.glb.toolkit/toolkit/withskinbinding/#withskinbinding_1)(this Node, params (Node Joint, Matrix4x4 InverseBindMatrix)[]) |  |
| static [WithSkinBinding](../../aspose.cad.fileformats.glb.toolkit/toolkit/withskinbinding/#withskinbinding)(this Node, Matrix4x4, params Node[]) |  |
| static [WithSkinnedMesh](../../aspose.cad.fileformats.glb.toolkit/toolkit/withskinnedmesh/#withskinnedmesh_1)(this Node, Mesh, params (Node Joint, Matrix4x4 InverseBindMatrix)[]) |  |
| static [WithSkinnedMesh](../../aspose.cad.fileformats.glb.toolkit/toolkit/withskinnedmesh/#withskinnedmesh)(this Node, Mesh, Matrix4x4, params Node[]) |  |
| static [WithSpotCone](../../aspose.cad.fileformats.glb.toolkit/toolkit/withspotcone/)(this PunctualLight, float, float) | Sets the cone angles for the Spot light. |
| static [WithTranslationAnimation](../../aspose.cad.fileformats.glb.toolkit/toolkit/withtranslationanimation/#withtranslationanimation_2)(this Node, string, params (float Key, Vector3 Value)[]) |  |
| static [WithTranslationAnimation](../../aspose.cad.fileformats.glb.toolkit/toolkit/withtranslationanimation/#withtranslationanimation)(this Node, string, ICurveSampler&lt;Vector3&gt;) |  |
| static [WithTranslationAnimation](../../aspose.cad.fileformats.glb.toolkit/toolkit/withtranslationanimation/#withtranslationanimation_1)(this Node, string, IReadOnlyDictionary&lt;float, Vector3&gt;) |  |
| static [WithUnlit](../../aspose.cad.fileformats.glb.toolkit/toolkit/withunlit/)(this Material) | Initializes this [`Material`](../../aspose.cad.fileformats.glb/material/) instance with Unlit attributes. |
| static [WithVertexAccessor](../../aspose.cad.fileformats.glb.toolkit/toolkit/withvertexaccessor/#withvertexaccessor)(this MeshPrimitive, MemoryAccessor) |  |
| static [WithVertexAccessor](../../aspose.cad.fileformats.glb.toolkit/toolkit/withvertexaccessor/#withvertexaccessor_4)(this MeshPrimitive, string, IReadOnlyList&lt;float&gt;) |  |
| static [WithVertexAccessor](../../aspose.cad.fileformats.glb.toolkit/toolkit/withvertexaccessor/#withvertexaccessor_1)(this MeshPrimitive, string, IReadOnlyList&lt;Vector2&gt;) |  |
| static [WithVertexAccessor](../../aspose.cad.fileformats.glb.toolkit/toolkit/withvertexaccessor/#withvertexaccessor_2)(this MeshPrimitive, string, IReadOnlyList&lt;Vector3&gt;) |  |
| static [WithVertexAccessor](../../aspose.cad.fileformats.glb.toolkit/toolkit/withvertexaccessor/#withvertexaccessor_3)(this MeshPrimitive, string, IReadOnlyList&lt;Vector4&gt;) |  |
| static [WithVertexAccessors](../../aspose.cad.fileformats.glb.toolkit/toolkit/withvertexaccessors/#withvertexaccessors)(this MeshPrimitive, IEnumerable&lt;MemoryAccessor&gt;) |  |
| static [WithVertexAccessors](../../aspose.cad.fileformats.glb.toolkit/toolkit/withvertexaccessors/#withvertexaccessors_2)(this MeshPrimitive, IReadOnlyList&lt;VertexPosition&gt;) |  |
| static [WithVertexAccessors](../../aspose.cad.fileformats.glb.toolkit/toolkit/withvertexaccessors/#withvertexaccessors_1)(this MeshPrimitive, IReadOnlyList&lt;VertexPositionNormal&gt;) |  |
| static [WithVertexAccessors&lt;TVertex&gt;](../../aspose.cad.fileformats.glb.toolkit/toolkit/withvertexaccessors/#withvertexaccessors_3)(this MeshPrimitive, IReadOnlyList&lt;TVertex&gt;) |  |
| static [WithVertexAccessors&lt;TvP,TvM&gt;](../../aspose.cad.fileformats.glb.toolkit/toolkit/withvertexaccessors/#withvertexaccessors_5)(this MeshPrimitive, IReadOnlyList&lt;(TvP Geo, TvM Mat)&gt;) |  |
| static [WithVertexAccessors&lt;TvP,TvM,TvS&gt;](../../aspose.cad.fileformats.glb.toolkit/toolkit/withvertexaccessors/#withvertexaccessors_4)(this MeshPrimitive, IReadOnlyList&lt;(TvP Geo, TvM Mat, TvS Skin)&gt;) |  |

### See Also

* namespace [Aspose.CAD.FileFormats.GLB.ToolKit](../../aspose.cad.fileformats.glb.toolkit/)
* assembly [Aspose.CAD](../../)


