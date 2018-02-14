package tech.adriano.webfluxdemo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created on 14/02/18.
 *
 * @author Adriano Oliveira
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class IP {
    private String origin;
}
