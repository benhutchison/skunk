// Copyright (c) 2018-2024 by Rob Norris and Contributors
// This software is licensed under the MIT License (MIT).
// For more information see LICENSE or https://opensource.org/licenses/MIT

package skunk.syntax

trait ToAllOps
  extends ToIdOps
     with ToStringContextOps
     with ToListOps
     with ToCodecOps
     with ToEncoderOps
     with ToDecoderOps

object all extends ToAllOps