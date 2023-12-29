---
title: Scene
second_title: Aspose.3D for Java API Reference
description: A scene is a top-level object that contains the nodes geometries materials textures animation poses sub-scenes and etc.
type: docs
weight: 151
url: /java/com.aspose.threed/scene/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.SceneObject](../../com.aspose.threed/sceneobject)
```
public class Scene extends SceneObject
```

A scene is a top-level object that contains the nodes, geometries, materials, textures, animation, poses, sub-scenes and etc. Scene can have sub-scenes, acts as multiple-document support in files like collada/blender/fbx Node hierarchy can be accessed through [getRootNode](../../com.aspose.threed/scene\#getRootNode) [getLibrary](../../com.aspose.threed/scene\#getLibrary) is used to keep a reference of unattached objects during serialization(like meta data or custom objects) so it can be used as a library.
## Constructors

| Constructor | Description |
| --- | --- |
| [Scene()](#Scene--) | Initializes a new instance of the [Scene](../../com.aspose.threed/scene) class. |
| [Scene(Entity entity)](#Scene-com.aspose.threed.Entity-) | Initializes a new instance of the [Scene](../../com.aspose.threed/scene) class with an entity attached to a new node. |
| [Scene(Scene parentScene, String name)](#Scene-com.aspose.threed.Scene-java.lang.String-) | Initializes a new instance of the [Scene](../../com.aspose.threed/scene) class as a sub-scene. |
| [Scene(String fileName)](#Scene-java.lang.String-) | Initializes a new instance of the [Scene](../../com.aspose.threed/scene) class and open the file immediately. |
## Fields

| Field | Description |
| --- | --- |
| [VERSION](#VERSION) |  |
## Methods

| Method | Description |
| --- | --- |
| [clear()](#clear--) | Clears the scene content and restores the default settings. |
| [createAnimationClip(String name)](#createAnimationClip-java.lang.String-) | A shorthand function to create and register the [AnimationClip](../../com.aspose.threed/animationclip) The first [AnimationClip](../../com.aspose.threed/animationclip) will be assigned to the [getCurrentAnimationClip](../../com.aspose.threed/scene\#getCurrentAnimationClip) |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [findProperty(String propertyName)](#findProperty-java.lang.String-) | Finds the property. |
| [fromFile(String fileName)](#fromFile-java.lang.String-) | Opens the scene from given path |
| [fromFile(String fileName, Cancellation cancellationToken)](#fromFile-java.lang.String-com.aspose.threed.Cancellation-) | Opens the scene from given path |
| [fromFile(String fileName, FileFormat format)](#fromFile-java.lang.String-com.aspose.threed.FileFormat-) | Opens the scene from given path using specified file format. |
| [fromFile(String fileName, FileFormat format, Cancellation cancellationToken)](#fromFile-java.lang.String-com.aspose.threed.FileFormat-com.aspose.threed.Cancellation-) | Opens the scene from given path using specified file format. |
| [fromFile(String fileName, LoadOptions options)](#fromFile-java.lang.String-com.aspose.threed.LoadOptions-) | Opens the scene from given path using specified file format. |
| [fromFile(String fileName, LoadOptions options, Cancellation cancellationToken)](#fromFile-java.lang.String-com.aspose.threed.LoadOptions-com.aspose.threed.Cancellation-) | Opens the scene from given path using specified file format. |
| [fromStream(Stream stream)](#fromStream-com.aspose.csporter.helpers.Stream-) | Opens the scene from given stream |
| [fromStream(Stream stream, Cancellation cancellationToken)](#fromStream-com.aspose.csporter.helpers.Stream-com.aspose.threed.Cancellation-) | Opens the scene from given stream |
| [fromStream(Stream stream, FileFormat format)](#fromStream-com.aspose.csporter.helpers.Stream-com.aspose.threed.FileFormat-) | Opens the scene from given stream using specified file format. |
| [fromStream(Stream stream, FileFormat format, Cancellation cancellationToken)](#fromStream-com.aspose.csporter.helpers.Stream-com.aspose.threed.FileFormat-com.aspose.threed.Cancellation-) | Opens the scene from given stream using specified file format. |
| [fromStream(Stream stream, LoadOptions options)](#fromStream-com.aspose.csporter.helpers.Stream-com.aspose.threed.LoadOptions-) | Opens the scene from given stream using specified IO config. |
| [fromStream(Stream stream, LoadOptions options, Cancellation cancellationToken)](#fromStream-com.aspose.csporter.helpers.Stream-com.aspose.threed.LoadOptions-com.aspose.threed.Cancellation-) | Opens the scene from given stream using specified IO config. |
| [getAnimationClip(String name)](#getAnimationClip-java.lang.String-) | Gets a named [AnimationClip](../../com.aspose.threed/animationclip) |
| [getAnimationClips()](#getAnimationClips--) | Gets all [AnimationClip](../../com.aspose.threed/animationclip) defined in the scene. |
| [getAssetInfo()](#getAssetInfo--) | Gets the top-level asset information |
| [getClass()](#getClass--) |  |
| [getCurrentAnimationClip()](#getCurrentAnimationClip--) | Gets the active [AnimationClip](../../com.aspose.threed/animationclip) |
| [getLibrary()](#getLibrary--) | Objects that not directly used in scene hierarchy can be defined in Library. |
| [getName()](#getName--) | Gets the name. |
| [getPoses()](#getPoses--) | Gets all [Pose](../../com.aspose.threed/pose) used in this scene. |
| [getProperties()](#getProperties--) | Gets the collection of all properties. |
| [getProperty(String property)](#getProperty-java.lang.String-) | Get the value of specified property |
| [getRootNode()](#getRootNode--) | Gets the root node of the scene. |
| [getScene()](#getScene--) | Gets the scene that this object belongs to |
| [getSubScenes()](#getSubScenes--) | Gets all sub-scenes |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [open(Stream stream)](#open-com.aspose.csporter.helpers.Stream-) | Opens the scene from given stream |
| [open(Stream stream, Cancellation cancellationToken)](#open-com.aspose.csporter.helpers.Stream-com.aspose.threed.Cancellation-) | Opens the scene from given stream |
| [open(Stream stream, FileFormat format)](#open-com.aspose.csporter.helpers.Stream-com.aspose.threed.FileFormat-) | Opens the scene from given stream using specified file format. |
| [open(Stream stream, FileFormat format, Cancellation cancellationToken)](#open-com.aspose.csporter.helpers.Stream-com.aspose.threed.FileFormat-com.aspose.threed.Cancellation-) | Opens the scene from given stream using specified file format. |
| [open(Stream stream, LoadOptions options)](#open-com.aspose.csporter.helpers.Stream-com.aspose.threed.LoadOptions-) | Opens the scene from given stream using specified IO config. |
| [open(Stream stream, LoadOptions options, Cancellation cancellationToken)](#open-com.aspose.csporter.helpers.Stream-com.aspose.threed.LoadOptions-com.aspose.threed.Cancellation-) | Opens the scene from given stream using specified IO config. |
| [open(String fileName)](#open-java.lang.String-) | Opens the scene from given path |
| [open(String fileName, Cancellation cancellationToken)](#open-java.lang.String-com.aspose.threed.Cancellation-) | Opens the scene from given path |
| [open(String fileName, FileFormat format)](#open-java.lang.String-com.aspose.threed.FileFormat-) | Opens the scene from given path using specified file format. |
| [open(String fileName, FileFormat format, Cancellation cancellationToken)](#open-java.lang.String-com.aspose.threed.FileFormat-com.aspose.threed.Cancellation-) | Opens the scene from given path using specified file format. |
| [open(String fileName, LoadOptions options)](#open-java.lang.String-com.aspose.threed.LoadOptions-) | Opens the scene from given path using specified file format. |
| [open(String fileName, LoadOptions options, Cancellation cancellationToken)](#open-java.lang.String-com.aspose.threed.LoadOptions-com.aspose.threed.Cancellation-) | Opens the scene from given path using specified file format. |
| [removeProperty(Property property)](#removeProperty-com.aspose.threed.Property-) | Removes a dynamic property. |
| [removeProperty(String property)](#removeProperty-java.lang.String-) | Remove the specified property identified by name |
| [render(Camera camera, TextureData bitmap)](#render-com.aspose.threed.Camera-com.aspose.threed.TextureData-) | Render the scene into bitmap from given camera's perspective. |
| [render(Camera camera, TextureData bitmap, ImageRenderOptions options)](#render-com.aspose.threed.Camera-com.aspose.threed.TextureData-com.aspose.threed.ImageRenderOptions-) | Render the scene into bitmap from given camera's perspective. |
| [render(Camera camera, String fileName)](#render-com.aspose.threed.Camera-java.lang.String-) | Render the scene into external file from given camera's perspective. |
| [render(Camera camera, String fileName, Vector2 size, String format)](#render-com.aspose.threed.Camera-java.lang.String-com.aspose.threed.Vector2-java.lang.String-) | Render the scene into external file from given camera's perspective. |
| [render(Camera camera, String fileName, Vector2 size, String format, ImageRenderOptions options)](#render-com.aspose.threed.Camera-java.lang.String-com.aspose.threed.Vector2-java.lang.String-com.aspose.threed.ImageRenderOptions-) | Render the scene into external file from given camera's perspective. |
| [save(Stream stream, FileFormat format)](#save-com.aspose.csporter.helpers.Stream-com.aspose.threed.FileFormat-) | Saves the scene to stream using specified file format. |
| [save(Stream stream, FileFormat format, Cancellation cancellationToken)](#save-com.aspose.csporter.helpers.Stream-com.aspose.threed.FileFormat-com.aspose.threed.Cancellation-) | Saves the scene to stream using specified file format. |
| [save(Stream stream, SaveOptions options)](#save-com.aspose.csporter.helpers.Stream-com.aspose.threed.SaveOptions-) | Saves the scene to stream using specified file format. |
| [save(Stream stream, SaveOptions options, Cancellation cancellationToken)](#save-com.aspose.csporter.helpers.Stream-com.aspose.threed.SaveOptions-com.aspose.threed.Cancellation-) | Saves the scene to stream using specified file format. |
| [save(String fileName)](#save-java.lang.String-) | Saves the scene to specified path using specified file format. |
| [save(String fileName, FileFormat format)](#save-java.lang.String-com.aspose.threed.FileFormat-) | Saves the scene to specified path using specified file format. |
| [save(String fileName, FileFormat format, Cancellation cancellationToken)](#save-java.lang.String-com.aspose.threed.FileFormat-com.aspose.threed.Cancellation-) | Saves the scene to specified path using specified file format. |
| [save(String fileName, SaveOptions options)](#save-java.lang.String-com.aspose.threed.SaveOptions-) | Saves the scene to specified path using specified file format. |
| [save(String fileName, SaveOptions options, Cancellation cancellationToken)](#save-java.lang.String-com.aspose.threed.SaveOptions-com.aspose.threed.Cancellation-) | Saves the scene to specified path using specified file format. |
| [setAssetInfo(AssetInfo value)](#setAssetInfo-com.aspose.threed.AssetInfo-) | Sets the top-level asset information |
| [setCurrentAnimationClip(AnimationClip value)](#setCurrentAnimationClip-com.aspose.threed.AnimationClip-) | Sets the active [AnimationClip](../../com.aspose.threed/animationclip) |
| [setName(String value)](#setName-java.lang.String-) | Sets the name. |
| [setProperty(String property, Object value)](#setProperty-java.lang.String-java.lang.Object-) | Sets the value of specified property |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Scene() {#Scene--}
```
public Scene()
```


Initializes a new instance of the [Scene](../../com.aspose.threed/scene) class.

### Scene(Entity entity) {#Scene-com.aspose.threed.Entity-}
```
public Scene(Entity entity)
```


Initializes a new instance of the [Scene](../../com.aspose.threed/scene) class with an entity attached to a new node.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| entity | [Entity](../../com.aspose.threed/entity) | The initial entity that attached to the scene |

### Scene(Scene parentScene, String name) {#Scene-com.aspose.threed.Scene-java.lang.String-}
```
public Scene(Scene parentScene, String name)
```


Initializes a new instance of the [Scene](../../com.aspose.threed/scene) class as a sub-scene.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| parentScene | [Scene](../../com.aspose.threed/scene) | The parent scene. |
| name | java.lang.String | Scene's name. |

### Scene(String fileName) {#Scene-java.lang.String-}
```
public Scene(String fileName)
```


Initializes a new instance of the [Scene](../../com.aspose.threed/scene) class and open the file immediately. This is an obsoleted constructor, please use [Scene](../../com.aspose.threed/scene).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileName | java.lang.String | File's name to open. |

### VERSION {#VERSION}
```
public static final String VERSION
```


### clear() {#clear--}
```
public void clear()
```


Clears the scene content and restores the default settings.

### createAnimationClip(String name) {#createAnimationClip-java.lang.String-}
```
public AnimationClip createAnimationClip(String name)
```


A shorthand function to create and register the [AnimationClip](../../com.aspose.threed/animationclip) The first [AnimationClip](../../com.aspose.threed/animationclip) will be assigned to the [getCurrentAnimationClip](../../com.aspose.threed/scene\#getCurrentAnimationClip)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Animation clip's name |

**Returns:**
[AnimationClip](../../com.aspose.threed/animationclip)
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### findProperty(String propertyName) {#findProperty-java.lang.String-}
```
public Property findProperty(String propertyName)
```


Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| propertyName | java.lang.String | Property name. |

**Returns:**
[Property](../../com.aspose.threed/property) - The property.
### fromFile(String fileName) {#fromFile-java.lang.String-}
```
public static Scene fromFile(String fileName)
```


Opens the scene from given path

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileName | java.lang.String | File name. |

**Returns:**
[Scene](../../com.aspose.threed/scene)
### fromFile(String fileName, Cancellation cancellationToken) {#fromFile-java.lang.String-com.aspose.threed.Cancellation-}
```
public static Scene fromFile(String fileName, Cancellation cancellationToken)
```


Opens the scene from given path

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileName | java.lang.String | File name. |
| cancellationToken | [Cancellation](../../com.aspose.threed/cancellation) | Cancellation token to the load task |

**Returns:**
[Scene](../../com.aspose.threed/scene)
### fromFile(String fileName, FileFormat format) {#fromFile-java.lang.String-com.aspose.threed.FileFormat-}
```
public static Scene fromFile(String fileName, FileFormat format)
```


Opens the scene from given path using specified file format.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileName | java.lang.String | File name. |
| format | [FileFormat](../../com.aspose.threed/fileformat) | File format. |

**Returns:**
[Scene](../../com.aspose.threed/scene)
### fromFile(String fileName, FileFormat format, Cancellation cancellationToken) {#fromFile-java.lang.String-com.aspose.threed.FileFormat-com.aspose.threed.Cancellation-}
```
public static Scene fromFile(String fileName, FileFormat format, Cancellation cancellationToken)
```


Opens the scene from given path using specified file format.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileName | java.lang.String | File name. |
| format | [FileFormat](../../com.aspose.threed/fileformat) | File format. |
| cancellationToken | [Cancellation](../../com.aspose.threed/cancellation) | Cancellation token to the load task |

**Returns:**
[Scene](../../com.aspose.threed/scene)
### fromFile(String fileName, LoadOptions options) {#fromFile-java.lang.String-com.aspose.threed.LoadOptions-}
```
public static Scene fromFile(String fileName, LoadOptions options)
```


Opens the scene from given path using specified file format.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileName | java.lang.String | File name. |
| options | [LoadOptions](../../com.aspose.threed/loadoptions) | More detailed configuration to open the stream. |

**Returns:**
[Scene](../../com.aspose.threed/scene)
### fromFile(String fileName, LoadOptions options, Cancellation cancellationToken) {#fromFile-java.lang.String-com.aspose.threed.LoadOptions-com.aspose.threed.Cancellation-}
```
public static Scene fromFile(String fileName, LoadOptions options, Cancellation cancellationToken)
```


Opens the scene from given path using specified file format.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileName | java.lang.String | File name. |
| options | [LoadOptions](../../com.aspose.threed/loadoptions) | More detailed configuration to open the stream. |
| cancellationToken | [Cancellation](../../com.aspose.threed/cancellation) | Cancellation token to the load task |

**Returns:**
[Scene](../../com.aspose.threed/scene)
### fromStream(Stream stream) {#fromStream-com.aspose.csporter.helpers.Stream-}
```
public static Scene fromStream(Stream stream)
```


Opens the scene from given stream

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | com.aspose.csporter.helpers.Stream | Input stream, user is responsible for closing the stream. |

**Returns:**
[Scene](../../com.aspose.threed/scene)
### fromStream(Stream stream, Cancellation cancellationToken) {#fromStream-com.aspose.csporter.helpers.Stream-com.aspose.threed.Cancellation-}
```
public static Scene fromStream(Stream stream, Cancellation cancellationToken)
```


Opens the scene from given stream

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | com.aspose.csporter.helpers.Stream | Input stream, user is responsible for closing the stream. |
| cancellationToken | [Cancellation](../../com.aspose.threed/cancellation) | Cancellation token to the load task |

**Returns:**
[Scene](../../com.aspose.threed/scene)
### fromStream(Stream stream, FileFormat format) {#fromStream-com.aspose.csporter.helpers.Stream-com.aspose.threed.FileFormat-}
```
public static Scene fromStream(Stream stream, FileFormat format)
```


Opens the scene from given stream using specified file format.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | com.aspose.csporter.helpers.Stream | Input stream, user is responsible for closing the stream. |
| format | [FileFormat](../../com.aspose.threed/fileformat) | File format. |

**Returns:**
[Scene](../../com.aspose.threed/scene)
### fromStream(Stream stream, FileFormat format, Cancellation cancellationToken) {#fromStream-com.aspose.csporter.helpers.Stream-com.aspose.threed.FileFormat-com.aspose.threed.Cancellation-}
```
public static Scene fromStream(Stream stream, FileFormat format, Cancellation cancellationToken)
```


Opens the scene from given stream using specified file format.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | com.aspose.csporter.helpers.Stream | Input stream, user is responsible for closing the stream. |
| format | [FileFormat](../../com.aspose.threed/fileformat) | File format. |
| cancellationToken | [Cancellation](../../com.aspose.threed/cancellation) | Cancellation token to the load task |

**Returns:**
[Scene](../../com.aspose.threed/scene)
### fromStream(Stream stream, LoadOptions options) {#fromStream-com.aspose.csporter.helpers.Stream-com.aspose.threed.LoadOptions-}
```
public static Scene fromStream(Stream stream, LoadOptions options)
```


Opens the scene from given stream using specified IO config.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | com.aspose.csporter.helpers.Stream | Input stream, user is responsible for closing the stream. |
| options | [LoadOptions](../../com.aspose.threed/loadoptions) | More detailed configuration to open the stream. |

**Returns:**
[Scene](../../com.aspose.threed/scene)
### fromStream(Stream stream, LoadOptions options, Cancellation cancellationToken) {#fromStream-com.aspose.csporter.helpers.Stream-com.aspose.threed.LoadOptions-com.aspose.threed.Cancellation-}
```
public static Scene fromStream(Stream stream, LoadOptions options, Cancellation cancellationToken)
```


Opens the scene from given stream using specified IO config.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | com.aspose.csporter.helpers.Stream | Input stream, user is responsible for closing the stream. |
| options | [LoadOptions](../../com.aspose.threed/loadoptions) | More detailed configuration to open the stream. |
| cancellationToken | [Cancellation](../../com.aspose.threed/cancellation) | Cancellation token to the load task |

**Returns:**
[Scene](../../com.aspose.threed/scene)
### getAnimationClip(String name) {#getAnimationClip-java.lang.String-}
```
public AnimationClip getAnimationClip(String name)
```


Gets a named [AnimationClip](../../com.aspose.threed/animationclip)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | The [AnimationClip](../../com.aspose.threed/animationclip)'s name to look up |

**Returns:**
[AnimationClip](../../com.aspose.threed/animationclip) - Returned AnimationClip
### getAnimationClips() {#getAnimationClips--}
```
public List<AnimationClip> getAnimationClips()
```


Gets all [AnimationClip](../../com.aspose.threed/animationclip) defined in the scene.

**Returns:**
java.util.List<com.aspose.threed.AnimationClip>
### getAssetInfo() {#getAssetInfo--}
```
public AssetInfo getAssetInfo()
```


Gets the top-level asset information

**Returns:**
[AssetInfo](../../com.aspose.threed/assetinfo)
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getCurrentAnimationClip() {#getCurrentAnimationClip--}
```
public AnimationClip getCurrentAnimationClip()
```


Gets the active [AnimationClip](../../com.aspose.threed/animationclip)

**Returns:**
[AnimationClip](../../com.aspose.threed/animationclip)
### getLibrary() {#getLibrary--}
```
public List<A3DObject> getLibrary()
```


Objects that not directly used in scene hierarchy can be defined in Library. This is useful when you're using sub-scenes and put reusable components under sub-scenes.

**Returns:**
java.util.List<com.aspose.threed.A3DObject>
### getName() {#getName--}
```
public String getName()
```


Gets the name.

**Returns:**
java.lang.String
### getPoses() {#getPoses--}
```
public Collection<Pose> getPoses()
```


Gets all [Pose](../../com.aspose.threed/pose) used in this scene.

**Returns:**
java.util.Collection<com.aspose.threed.Pose>
### getProperties() {#getProperties--}
```
public PropertyCollection getProperties()
```


Gets the collection of all properties.

**Returns:**
[PropertyCollection](../../com.aspose.threed/propertycollection)
### getProperty(String property) {#getProperty-java.lang.String-}
```
public Object getProperty(String property)
```


Get the value of specified property

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| property | java.lang.String | Property name |

**Returns:**
java.lang.Object - The value of the found property
### getRootNode() {#getRootNode--}
```
public Node getRootNode()
```


Gets the root node of the scene.

**Returns:**
[Node](../../com.aspose.threed/node)
### getScene() {#getScene--}
```
public Scene getScene()
```


Gets the scene that this object belongs to

**Returns:**
[Scene](../../com.aspose.threed/scene)
### getSubScenes() {#getSubScenes--}
```
public List<Scene> getSubScenes()
```


Gets all sub-scenes

**Returns:**
java.util.List<com.aspose.threed.Scene>
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### open(Stream stream) {#open-com.aspose.csporter.helpers.Stream-}
```
public void open(Stream stream)
```


Opens the scene from given stream

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | com.aspose.csporter.helpers.Stream | Input stream, user is responsible for closing the stream. |

### open(Stream stream, Cancellation cancellationToken) {#open-com.aspose.csporter.helpers.Stream-com.aspose.threed.Cancellation-}
```
public void open(Stream stream, Cancellation cancellationToken)
```


Opens the scene from given stream

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | com.aspose.csporter.helpers.Stream | Input stream, user is responsible for closing the stream. |
| cancellationToken | [Cancellation](../../com.aspose.threed/cancellation) | Cancellation token to the load task |

### open(Stream stream, FileFormat format) {#open-com.aspose.csporter.helpers.Stream-com.aspose.threed.FileFormat-}
```
public void open(Stream stream, FileFormat format)
```


Opens the scene from given stream using specified file format.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | com.aspose.csporter.helpers.Stream | Input stream, user is responsible for closing the stream. |
| format | [FileFormat](../../com.aspose.threed/fileformat) | File format. |

### open(Stream stream, FileFormat format, Cancellation cancellationToken) {#open-com.aspose.csporter.helpers.Stream-com.aspose.threed.FileFormat-com.aspose.threed.Cancellation-}
```
public void open(Stream stream, FileFormat format, Cancellation cancellationToken)
```


Opens the scene from given stream using specified file format.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | com.aspose.csporter.helpers.Stream | Input stream, user is responsible for closing the stream. |
| format | [FileFormat](../../com.aspose.threed/fileformat) | File format. |
| cancellationToken | [Cancellation](../../com.aspose.threed/cancellation) | Cancellation token to the load task |

### open(Stream stream, LoadOptions options) {#open-com.aspose.csporter.helpers.Stream-com.aspose.threed.LoadOptions-}
```
public void open(Stream stream, LoadOptions options)
```


Opens the scene from given stream using specified IO config.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | com.aspose.csporter.helpers.Stream | Input stream, user is responsible for closing the stream. |
| options | [LoadOptions](../../com.aspose.threed/loadoptions) | More detailed configuration to open the stream. |

### open(Stream stream, LoadOptions options, Cancellation cancellationToken) {#open-com.aspose.csporter.helpers.Stream-com.aspose.threed.LoadOptions-com.aspose.threed.Cancellation-}
```
public void open(Stream stream, LoadOptions options, Cancellation cancellationToken)
```


Opens the scene from given stream using specified IO config.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | com.aspose.csporter.helpers.Stream | Input stream, user is responsible for closing the stream. |
| options | [LoadOptions](../../com.aspose.threed/loadoptions) | More detailed configuration to open the stream. |
| cancellationToken | [Cancellation](../../com.aspose.threed/cancellation) | Cancellation token to the load task |

### open(String fileName) {#open-java.lang.String-}
```
public void open(String fileName)
```


Opens the scene from given path

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileName | java.lang.String | File name. |

### open(String fileName, Cancellation cancellationToken) {#open-java.lang.String-com.aspose.threed.Cancellation-}
```
public void open(String fileName, Cancellation cancellationToken)
```


Opens the scene from given path

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileName | java.lang.String | File name. |
| cancellationToken | [Cancellation](../../com.aspose.threed/cancellation) | Cancellation token to the load task |

### open(String fileName, FileFormat format) {#open-java.lang.String-com.aspose.threed.FileFormat-}
```
public void open(String fileName, FileFormat format)
```


Opens the scene from given path using specified file format.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileName | java.lang.String | File name. |
| format | [FileFormat](../../com.aspose.threed/fileformat) | File format. |

### open(String fileName, FileFormat format, Cancellation cancellationToken) {#open-java.lang.String-com.aspose.threed.FileFormat-com.aspose.threed.Cancellation-}
```
public void open(String fileName, FileFormat format, Cancellation cancellationToken)
```


Opens the scene from given path using specified file format.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileName | java.lang.String | File name. |
| format | [FileFormat](../../com.aspose.threed/fileformat) | File format. |
| cancellationToken | [Cancellation](../../com.aspose.threed/cancellation) | Cancellation token to the load task |

### open(String fileName, LoadOptions options) {#open-java.lang.String-com.aspose.threed.LoadOptions-}
```
public void open(String fileName, LoadOptions options)
```


Opens the scene from given path using specified file format.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileName | java.lang.String | File name. |
| options | [LoadOptions](../../com.aspose.threed/loadoptions) | More detailed configuration to open the stream. |

### open(String fileName, LoadOptions options, Cancellation cancellationToken) {#open-java.lang.String-com.aspose.threed.LoadOptions-com.aspose.threed.Cancellation-}
```
public void open(String fileName, LoadOptions options, Cancellation cancellationToken)
```


Opens the scene from given path using specified file format.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileName | java.lang.String | File name. |
| options | [LoadOptions](../../com.aspose.threed/loadoptions) | More detailed configuration to open the stream. |
| cancellationToken | [Cancellation](../../com.aspose.threed/cancellation) | Cancellation token to the load task |

### removeProperty(Property property) {#removeProperty-com.aspose.threed.Property-}
```
public boolean removeProperty(Property property)
```


Removes a dynamic property.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| property | [Property](../../com.aspose.threed/property) | Which property to remove |

**Returns:**
boolean - true if the property is successfully removed
### removeProperty(String property) {#removeProperty-java.lang.String-}
```
public boolean removeProperty(String property)
```


Remove the specified property identified by name

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| property | java.lang.String |  |

**Returns:**
boolean
### render(Camera camera, TextureData bitmap) {#render-com.aspose.threed.Camera-com.aspose.threed.TextureData-}
```
public void render(Camera camera, TextureData bitmap)
```


Render the scene into bitmap from given camera's perspective.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| camera | [Camera](../../com.aspose.threed/camera) | From which camera's perspective to render the scene |
| bitmap | [TextureData](../../com.aspose.threed/texturedata) | Target of the rendered result |

### render(Camera camera, TextureData bitmap, ImageRenderOptions options) {#render-com.aspose.threed.Camera-com.aspose.threed.TextureData-com.aspose.threed.ImageRenderOptions-}
```
public void render(Camera camera, TextureData bitmap, ImageRenderOptions options)
```


Render the scene into bitmap from given camera's perspective.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| camera | [Camera](../../com.aspose.threed/camera) | From which camera's perspective to render the scene |
| bitmap | [TextureData](../../com.aspose.threed/texturedata) | Target of the rendered result |
| options | [ImageRenderOptions](../../com.aspose.threed/imagerenderoptions) | The option to customize some internal settings. |

### render(Camera camera, String fileName) {#render-com.aspose.threed.Camera-java.lang.String-}
```
public void render(Camera camera, String fileName)
```


Render the scene into external file from given camera's perspective. The default output size is 1024x768 and output format is png

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| camera | [Camera](../../com.aspose.threed/camera) | From which camera's perspective to render the scene |
| fileName | java.lang.String | The file name of output file |

### render(Camera camera, String fileName, Vector2 size, String format) {#render-com.aspose.threed.Camera-java.lang.String-com.aspose.threed.Vector2-java.lang.String-}
```
public void render(Camera camera, String fileName, Vector2 size, String format)
```


Render the scene into external file from given camera's perspective.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| camera | [Camera](../../com.aspose.threed/camera) | From which camera's perspective to render the scene |
| fileName | java.lang.String | The file name of output file |
| size | [Vector2](../../com.aspose.threed/vector2) | The size of final rendered image |
| format | java.lang.String | The image format of the output file |

### render(Camera camera, String fileName, Vector2 size, String format, ImageRenderOptions options) {#render-com.aspose.threed.Camera-java.lang.String-com.aspose.threed.Vector2-java.lang.String-com.aspose.threed.ImageRenderOptions-}
```
public void render(Camera camera, String fileName, Vector2 size, String format, ImageRenderOptions options)
```


Render the scene into external file from given camera's perspective.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| camera | [Camera](../../com.aspose.threed/camera) | From which camera's perspective to render the scene |
| fileName | java.lang.String | The file name of output file |
| size | [Vector2](../../com.aspose.threed/vector2) | The size of final rendered image |
| format | java.lang.String | The image format of the output file |
| options | [ImageRenderOptions](../../com.aspose.threed/imagerenderoptions) | The option to customize some internal settings. |

### save(Stream stream, FileFormat format) {#save-com.aspose.csporter.helpers.Stream-com.aspose.threed.FileFormat-}
```
public void save(Stream stream, FileFormat format)
```


Saves the scene to stream using specified file format.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | com.aspose.csporter.helpers.Stream | Input stream, user is responsible for closing the stream. |
| format | [FileFormat](../../com.aspose.threed/fileformat) | Format. |

### save(Stream stream, FileFormat format, Cancellation cancellationToken) {#save-com.aspose.csporter.helpers.Stream-com.aspose.threed.FileFormat-com.aspose.threed.Cancellation-}
```
public void save(Stream stream, FileFormat format, Cancellation cancellationToken)
```


Saves the scene to stream using specified file format.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | com.aspose.csporter.helpers.Stream | Input stream, user is responsible for closing the stream. |
| format | [FileFormat](../../com.aspose.threed/fileformat) | Format. |
| cancellationToken | [Cancellation](../../com.aspose.threed/cancellation) | Cancellation token to the save task |

### save(Stream stream, SaveOptions options) {#save-com.aspose.csporter.helpers.Stream-com.aspose.threed.SaveOptions-}
```
public void save(Stream stream, SaveOptions options)
```


Saves the scene to stream using specified file format.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | com.aspose.csporter.helpers.Stream | Input stream, user is responsible for closing the stream. |
| options | [SaveOptions](../../com.aspose.threed/saveoptions) | More detailed configuration to save the stream. |

### save(Stream stream, SaveOptions options, Cancellation cancellationToken) {#save-com.aspose.csporter.helpers.Stream-com.aspose.threed.SaveOptions-com.aspose.threed.Cancellation-}
```
public void save(Stream stream, SaveOptions options, Cancellation cancellationToken)
```


Saves the scene to stream using specified file format.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | com.aspose.csporter.helpers.Stream | Input stream, user is responsible for closing the stream. |
| options | [SaveOptions](../../com.aspose.threed/saveoptions) | More detailed configuration to save the stream. |
| cancellationToken | [Cancellation](../../com.aspose.threed/cancellation) | Cancellation token to the save task |

### save(String fileName) {#save-java.lang.String-}
```
public void save(String fileName)
```


Saves the scene to specified path using specified file format.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileName | java.lang.String | File name. |

### save(String fileName, FileFormat format) {#save-java.lang.String-com.aspose.threed.FileFormat-}
```
public void save(String fileName, FileFormat format)
```


Saves the scene to specified path using specified file format.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileName | java.lang.String | File name. |
| format | [FileFormat](../../com.aspose.threed/fileformat) | Format. |

### save(String fileName, FileFormat format, Cancellation cancellationToken) {#save-java.lang.String-com.aspose.threed.FileFormat-com.aspose.threed.Cancellation-}
```
public void save(String fileName, FileFormat format, Cancellation cancellationToken)
```


Saves the scene to specified path using specified file format.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileName | java.lang.String | File name. |
| format | [FileFormat](../../com.aspose.threed/fileformat) | Format. |
| cancellationToken | [Cancellation](../../com.aspose.threed/cancellation) | Cancellation token to the save task |

### save(String fileName, SaveOptions options) {#save-java.lang.String-com.aspose.threed.SaveOptions-}
```
public void save(String fileName, SaveOptions options)
```


Saves the scene to specified path using specified file format.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileName | java.lang.String | File name. |
| options | [SaveOptions](../../com.aspose.threed/saveoptions) | More detailed configuration to save the stream. |

### save(String fileName, SaveOptions options, Cancellation cancellationToken) {#save-java.lang.String-com.aspose.threed.SaveOptions-com.aspose.threed.Cancellation-}
```
public void save(String fileName, SaveOptions options, Cancellation cancellationToken)
```


Saves the scene to specified path using specified file format.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileName | java.lang.String | File name. |
| options | [SaveOptions](../../com.aspose.threed/saveoptions) | More detailed configuration to save the stream. |
| cancellationToken | [Cancellation](../../com.aspose.threed/cancellation) | Cancellation token to the save task |

### setAssetInfo(AssetInfo value) {#setAssetInfo-com.aspose.threed.AssetInfo-}
```
public void setAssetInfo(AssetInfo value)
```


Sets the top-level asset information

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [AssetInfo](../../com.aspose.threed/assetinfo) | New value |

### setCurrentAnimationClip(AnimationClip value) {#setCurrentAnimationClip-com.aspose.threed.AnimationClip-}
```
public void setCurrentAnimationClip(AnimationClip value)
```


Sets the active [AnimationClip](../../com.aspose.threed/animationclip)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [AnimationClip](../../com.aspose.threed/animationclip) | New value |

### setName(String value) {#setName-java.lang.String-}
```
public void setName(String value)
```


Sets the name.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### setProperty(String property, Object value) {#setProperty-java.lang.String-java.lang.Object-}
```
public void setProperty(String property, Object value)
```


Sets the value of specified property

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| property | java.lang.String | Property name |
| value | java.lang.Object | The value of the property |

### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final void wait(long arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

