---
title: Scene 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/scene/
---
## Scene class

  A scene is a top-level object that contains the nodes, geometries, materials, textures, animation, poses, sub-scenes and etc.  Scene can have sub-scenes, acts as multiple-document support in files like collada/blender/fbx  Node hierarchy can be accessed through RootNodeLibrary is used to keep a reference of unattached objects during serialization(like meta data or custom objects) so it can be used as a library.


## Methods

### constructor{#constructor}

| Name | Description |
| --- | --- |
| constructor() | Initializes a new instance of the Scene class. | 

 **Result:**



---


### constructor_overload{#constructor_overload}

| Name | Description |
| --- | --- |
| constructor_overload(entity) | Initializes a new instance of the Scene class with an entity attached to a new node. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| entity | Entity | The initial entity that attached to the scene |

 **Result:**



---


### constructor_overload$2{#constructor_overload$2}

| Name | Description |
| --- | --- |
| constructor_overload$2(parentScene, name) | Initializes a new instance of the Scene class as a sub-scene. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| parentScene | Scene | The parent scene. |
| name | String | Scene's name. |

 **Result:**



---


### constructor_overload$3{#constructor_overload$3}

| Name | Description |
| --- | --- |
| constructor_overload$3(fileName) | Initializes a new instance of the Scene class and open the file immediately. This is an obsoleted constructor, please use #Error Cref: M:Aspose.ThreeD.Scene.FromFile(System.String,System.Threading.CancellationToken). | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| fileName | String | File's name to open. |

 **Result:**



---


### getSubScenes{#getSubScenes}

| Name | Description |
| --- | --- |
| getSubScenes() | Gets all sub-scenes | 

 **Result:**



---


### getLibrary{#getLibrary}

| Name | Description |
| --- | --- |
| getLibrary() | Objects that not directly used in scene hierarchy can be defined in Library. This is useful when you're using sub-scenes and put reusable components under sub-scenes. | 

 **Result:**



---


### getAnimationClips{#getAnimationClips}

| Name | Description |
| --- | --- |
| getAnimationClips() | Gets all AnimationClip defined in the scene. | 

 **Result:**



---


### getCurrentAnimationClip{#getCurrentAnimationClip}

| Name | Description |
| --- | --- |
| getCurrentAnimationClip() | Gets or sets the active AnimationClip | 

 **Result:**



---


### setCurrentAnimationClip{#setCurrentAnimationClip}

| Name | Description |
| --- | --- |
| setCurrentAnimationClip(value) | Gets or sets the active AnimationClip | 

 **Result:**



---


### getAssetInfo{#getAssetInfo}

| Name | Description |
| --- | --- |
| getAssetInfo() | Gets or sets the top-level asset information The document info. | 

 **Result:**



---


### setAssetInfo{#setAssetInfo}

| Name | Description |
| --- | --- |
| setAssetInfo(value) | Gets or sets the top-level asset information The document info. | 

 **Result:**



---


### getPoses{#getPoses}

| Name | Description |
| --- | --- |
| getPoses() | Gets all Pose used in this scene. The poses. | 

 **Result:**



---


### getRootNode{#getRootNode}

| Name | Description |
| --- | --- |
| getRootNode() | Gets the root node of the scene. The root node. | 

 **Result:**



---


### getScene{#getScene}

| Name | Description |
| --- | --- |
| getScene() | Gets the scene that this object belongs to | 

 **Result:**



---


### getName{#getName}

| Name | Description |
| --- | --- |
| getName() | Gets or sets the name. The name. | 

 **Result:**



---


### setName{#setName}

| Name | Description |
| --- | --- |
| setName(value) | Gets or sets the name. The name. | 

 **Result:**



---


### getProperties{#getProperties}

| Name | Description |
| --- | --- |
| getProperties() | Gets the collection of all properties. | 

 **Result:**



---


### getAnimationClip{#getAnimationClip}

| Name | Description |
| --- | --- |
| getAnimationClip(name) | Gets a named AnimationClip | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| name | String | The |

 **Result:**
AnimationClip


---


### clear{#clear}

| Name | Description |
| --- | --- |
| clear() | Clears the scene content and restores the default settings. | 

 **Result:**
AnimationClip


---


### createAnimationClip{#createAnimationClip}

| Name | Description |
| --- | --- |
| createAnimationClip(name) | A shorthand function to create and register the AnimationClip The first AnimationClip will be assigned to the CurrentAnimationClip | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| name | String | Animation clip's name |

 **Result:**
AnimationClip


---


### open{#open}

| Name | Description |
| --- | --- |
| open(fileName, options) | Opens the scene from given path using specified file format. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| fileName | String | File name. |
| options | LoadOptions | More detailed configuration to open the stream. |

 **Result:**
AnimationClip


---


### open{#open}

| Name | Description |
| --- | --- |
| open(fileName) | Opens the scene from given path | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| fileName | String | File name. |

 **Result:**
AnimationClip


---


### fromFile{#fromFile}

| Name | Description |
| --- | --- |
| fromFile(fileName) | Opens the scene from given path | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| fileName | String | File name. |

 **Result:**
AnimationClip


---


### save{#save}

| Name | Description |
| --- | --- |
| save(fileName) | Saves the scene to specified path using specified file format. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| fileName | String | File name. |

 **Result:**
AnimationClip


---


### save{#save}

| Name | Description |
| --- | --- |
| save(fileName, format) | Saves the scene to specified path using specified file format. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| fileName | String | File name. |
| format | FileFormat | Format. |

 **Result:**
AnimationClip


---


### save{#save}

| Name | Description |
| --- | --- |
| save(fileName, options) | Saves the scene to specified path using specified file format. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| fileName | String | File name. |
| options | SaveOptions | More detailed configuration to save the stream. |

 **Result:**
AnimationClip


---


### render{#render}

| Name | Description |
| --- | --- |
| render(camera, fileName) | Render the scene into external file from given camera's perspective. The default output size is 1024x768 and output format is png | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| camera | Camera | From which camera's perspective to render the scene |
| fileName | String | The file name of output file |

 **Result:**
AnimationClip


---


### render{#render}

| Name | Description |
| --- | --- |
| render(camera, fileName, size, format) | Render the scene into external file from given camera's perspective. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| camera | Camera | From which camera's perspective to render the scene |
| fileName | String | The file name of output file |
| size | Vector2 | The size of final rendered image |
| format | String | The image format of the output file |

 **Result:**
AnimationClip


---


### render{#render}

| Name | Description |
| --- | --- |
| render(camera, fileName, size, format, options) | Render the scene into external file from given camera's perspective. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| camera | Camera | From which camera's perspective to render the scene |
| fileName | String | The file name of output file |
| size | Vector2 | The size of final rendered image |
| format | String | The image format of the output file |
| options | ImageRenderOptions | The option to customize some internal settings. |

 **Result:**
AnimationClip


---


### render{#render}

| Name | Description |
| --- | --- |
| render(camera, bitmap) | Render the scene into bitmap from given camera's perspective. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| camera | Camera | From which camera's perspective to render the scene |
| bitmap | TextureData | Target of the rendered result |

 **Result:**
AnimationClip


---


### render{#render}

| Name | Description |
| --- | --- |
| render(camera, bitmap, options) | Render the scene into bitmap from given camera's perspective. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| camera | Camera | From which camera's perspective to render the scene |
| bitmap | TextureData | Target of the rendered result |
| options | ImageRenderOptions | The option to customize some internal settings. |

 **Result:**
AnimationClip


---


### removeProperty{#removeProperty}

| Name | Description |
| --- | --- |
| removeProperty(property) | Removes a dynamic property. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| property | Property | Which property to remove |

 **Result:**
boolean


---


### removeProperty{#removeProperty}

| Name | Description |
| --- | --- |
| removeProperty(property) | Remove the specified property identified by name | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|  propert | String | null |

 **Result:**
boolean


---


### getProperty{#getProperty}

| Name | Description |
| --- | --- |
| getProperty(property) | Get the value of specified property | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| property | String | Property name |

 **Result:**
Object


---


### setProperty{#setProperty}

| Name | Description |
| --- | --- |
| setProperty(property, value) | Sets the value of specified property | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| property | String | Property name |
| value | Object | The value of the property |

 **Result:**
Object


---


### findProperty{#findProperty}

| Name | Description |
| --- | --- |
| findProperty(propertyName) | Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name) | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| propertyName | String | Property name. |

 **Result:**
Property


---



