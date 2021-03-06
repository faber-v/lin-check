package com.devexperts.dxlab.lincheck.verifier;

/*
 * #%L
 * Lincheck
 * %%
 * Copyright (C) 2015 - 2018 Devexperts, LLC
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-3.0.html>.
 * #L%
 */

import com.devexperts.dxlab.lincheck.execution.ExecutionResult;
import com.devexperts.dxlab.lincheck.execution.ExecutionScenario;

/**
 * This verifier does nothing and could be used for performance benchmarking.
 */
public class EpsilonVerifier implements Verifier {

    public EpsilonVerifier(ExecutionScenario scenario, Class<?> testClass) {}

    @Override
    public boolean verifyResults(ExecutionResult results) {
        return true; // Always correct results :)
    }
}
